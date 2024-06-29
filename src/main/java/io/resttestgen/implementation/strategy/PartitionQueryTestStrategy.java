package io.resttestgen.implementation.strategy;

import io.resttestgen.core.Environment;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.QueryOperations;
import io.resttestgen.core.testing.Strategy;
import io.resttestgen.core.testing.TestRunner;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.implementation.metamorphic.*;
import io.resttestgen.implementation.oracle.StatusCodeOracle;
import io.resttestgen.implementation.strategy.testResult.EqualityMetamorphicTestResult;
import io.resttestgen.implementation.strategy.testResult.PartitionMetamorphicTestResult;
import io.resttestgen.implementation.strategy.testResult.SubSetMetamorphicTestResult;
import io.resttestgen.implementation.writer.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
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
        PartitionMetamorphicTestResult partitionMetamorphicTestResult = new PartitionMetamorphicTestResult();
        SubSetMetamorphicTestResult subSetMetamorphicTestResult = new SubSetMetamorphicTestResult();
        EqualityMetamorphicTestResult equalityMetamorphicTestResult = new EqualityMetamorphicTestResult();
        while (!queryOperationsWithFilter.isEmpty()) {
            for (int i = 0; i < 100; i++) {
                Operation operationToTest = queryOperationsWithFilter.getFirst();
                logger.debug("Testing operation " + operationToTest);
                QueryMetamorphic subSetMetamorphic = new SubSetMetamorphic(operationToTest);
                QueryMetamorphic partitionMetamorphic = new PartitionMetamorphic(operationToTest);
                QueryMetamorphic equalityMetamorphic = new PartitionMetamorphic(operationToTest);

                try {
                    TestSequence subSetMetamorphicTestSequence = subSetMetamorphic.generateQueryMetamorphicTestSequences();
                    TestSequence partitionMetamorphicTestSequence = partitionMetamorphic.generateQueryMetamorphicTestSequences();
                    TestSequence equalityMetamorphicTestSequence = equalityMetamorphic.generateQueryMetamorphicTestSequences();
                    if (subSetMetamorphicTestSequence != null) {
                        runTestSequence(subSetMetamorphicTestSequence);
                        subSetMetamorphicTestResult.addTestSequence(subSetMetamorphicTestSequence);
                        writeTestResultToFile(subSetMetamorphicTestSequence, TestType.subset);
                        globalNominalTestSequence.append(subSetMetamorphicTestSequence);
                    }
                    if (partitionMetamorphicTestSequence != null) {
                        runTestSequence(partitionMetamorphicTestSequence);
                        partitionMetamorphicTestResult.addTestSequence(partitionMetamorphicTestSequence);
                        writeTestResultToFile(partitionMetamorphicTestSequence, TestType.partition);
                        globalNominalTestSequence.append(partitionMetamorphicTestSequence);
                    }
                    if(equalityMetamorphicTestSequence!=null){
                        runTestSequence(equalityMetamorphicTestSequence);
                        equalityMetamorphicTestResult.addTestSequence(equalityMetamorphicTestSequence);
                        writeTestResultToFile(equalityMetamorphicTestSequence, TestType.equality);
                        globalNominalTestSequence.append(equalityMetamorphicTestSequence);
                    }
                } catch (Exception e) {
                    logger.error(String.format("operationToTest: %s has exception:%s", operationToTest.getOperationId(),e));
                }
            }
            writeTestErrorResultToFile(partitionMetamorphicTestResult.getErrorTestSequence(),
                    TestType.partition, queryOperationsWithFilter.getFirst());

            writeTestErrorResultToFile(subSetMetamorphicTestResult.getErrorTestSequence(),
                    TestType.subset, queryOperationsWithFilter.getFirst());
            writeTestErrorResultToFile(equalityMetamorphicTestResult.getErrorTestSequence(),
                    TestType.subset, queryOperationsWithFilter.getFirst());

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

    public void writeTestResultToFile(TestSequence testSequence, TestType testType) {
        // Write report to file
        try {
            MetaMorphicTestResultWriter metaMorphicTestResultWriter =
                    new MetaMorphicTestResultWriter(testSequence, testType.name());
            metaMorphicTestResultWriter.write();
        } catch (IOException e) {
            logger.warn("Could not write report metaMorphicTestResultWriter to file.");
            e.printStackTrace();
        }
    }

    public void writeTestErrorResultToFile(List<TestSequence> testSequences, TestType testType, Operation operation) {
        for (TestSequence testSequence : testSequences) {
            // Write report to file
            try {
                MetaMorphicTestErrorResultWriter metaMorphicTestErrorResultWriter =
                        new MetaMorphicTestErrorResultWriter(testSequence, testType.name(), operation.getOperationId());
                metaMorphicTestErrorResultWriter.write();
            } catch (IOException e) {
                logger.warn("Could not write report metaMorphicTestErrorResultWriter to file.");
                e.printStackTrace();
            }
        }

    }

}

