package io.resttestgen.implementation.strategy;

import io.resttestgen.core.Environment;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.QueryOperations;
import io.resttestgen.core.testing.Strategy;
import io.resttestgen.core.testing.TestRunner;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.implementation.fuzzer.QueryMetamorphicFuzzer;
import io.resttestgen.implementation.metamorphic.*;
import io.resttestgen.implementation.oracle.StatusCodeOracle;
import io.resttestgen.implementation.writer.CoverageReportWriter;
import io.resttestgen.implementation.writer.MetaMorphicTestResultWriter;
import io.resttestgen.implementation.writer.ReportWriter;
import io.resttestgen.implementation.writer.RestAssuredWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PartitionQueryTestStrategy extends Strategy {

    private static final Logger logger = LogManager.getLogger(PartitionQueryTestStrategy.class);
    private static Environment environment = Environment.getInstance();

    private final TestSequence globalNominalTestSequence = new TestSequence();
    private final QueryOperations queryOperations = new QueryOperations();


    @Override
    public void start() {
        //初始化查询接口，将get类型的接口插过滤出来
        queryOperations.initQueryOperations(environment);
        LinkedList<Operation> queryOperationsWithFilter = queryOperations.getQueryOperationsWithFilter();
        logger.info("Query Operations:" + queryOperationsWithFilter.toString());
        List<TestSequence> testSequences = new ArrayList<>();
        while (!queryOperationsWithFilter.isEmpty()) {
            for (int i = 0; i < 10; i++) {
                Operation operationToTest = queryOperationsWithFilter.getFirst();
                logger.debug("Testing operation " + operationToTest);
                SubSetMetamorphic subSetMetamorphic = new SubSetMetamorphic(operationToTest);
                PartitionMetamorphic partitionMetamorphic = new PartitionMetamorphic(operationToTest);

                TestSequence subSetMetamorphicTestSequence = subSetMetamorphic.generateQueryMetamorphicTestSequences();
                TestSequence partitionMetamorphicTestSequence = partitionMetamorphic.generateQueryMetamorphicTestSequences();
                if(subSetMetamorphicTestSequence!=null){
                    runTestSequence(subSetMetamorphicTestSequence);
                    writeTestResultToFile(subSetMetamorphicTestSequence,TestType.subset);
                    globalNominalTestSequence.append(subSetMetamorphicTestSequence);
                }
                if(partitionMetamorphicTestSequence!=null){
                    runTestSequence(partitionMetamorphicTestSequence);
                    writeTestResultToFile(partitionMetamorphicTestSequence,TestType.partition);
                    globalNominalTestSequence.append(partitionMetamorphicTestSequence);
                }

            }

            queryOperationsWithFilter.removeFirst();
        }

        // Keep only successful test interactions in the sequence
        globalNominalTestSequence.filterBySuccessfulStatusCode();

        try {
            CoverageReportWriter coverageReportWriter = new CoverageReportWriter(TestRunner.getInstance().getCoverage());
            coverageReportWriter.write();
        } catch (
                IOException e) {
            logger.warn("Could not write Coverage report to file.");
            e.printStackTrace();
        }

    }

    public void runTestSequence(TestSequence testSequence) {
        logger.info("TestSequence: " + testSequence.toString());
        // Run test sequence
        TestRunner testRunner = TestRunner.getInstance();
        testRunner.run(testSequence);

        // Evaluate sequence with oracles
        StatusCodeOracle statusCodeOracle = new StatusCodeOracle();
        statusCodeOracle.assertTestSequence(testSequence);

        // Write report to file
        try {
            ReportWriter reportWriter = new ReportWriter(testSequence);
            reportWriter.write();
            RestAssuredWriter restAssuredWriter = new RestAssuredWriter(testSequence);
            restAssuredWriter.write();
        } catch (IOException e) {
            logger.warn("Could not write report to file.");
            e.printStackTrace();
        }
    }
    public void writeTestResultToFile(TestSequence testSequence,TestType testType){
        // Write report to file
        try {
            MetaMorphicTestResultWriter metaMorphicTestResultWriter =
                    new MetaMorphicTestResultWriter(testSequence,testType.name());
            metaMorphicTestResultWriter.write();
        } catch (IOException e) {
            logger.warn("Could not write report to file.");
            e.printStackTrace();
        }
    }
}

