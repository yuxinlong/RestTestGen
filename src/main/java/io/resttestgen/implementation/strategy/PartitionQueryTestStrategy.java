package io.resttestgen.implementation.strategy;

import io.resttestgen.core.Environment;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.QueryOperations;
import io.resttestgen.core.testing.Strategy;
import io.resttestgen.core.testing.TestSequence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        List<Operation> queryOperationsWithFilter = queryOperations.getQueryOperationsWithFilter();


    }
}
