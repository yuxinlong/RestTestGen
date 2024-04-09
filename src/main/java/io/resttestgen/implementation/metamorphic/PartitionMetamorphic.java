package io.resttestgen.implementation.metamorphic;

import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.TestInteraction;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.implementation.helper.DateUtils;
import io.resttestgen.implementation.strategy.PartitionQueryTestStrategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PartitionMetamorphic extends QueryMetamorphic {
    private static final Logger logger = LogManager.getLogger(PartitionQueryTestStrategy.class);

    private Map<String, Object> apiParamDictionary = apiParamConfiguration.getValueMap();
    private Map<String, List<String>> partition = apiParamConfiguration.getSubset();
    private final String COMPLETE = "complete";
    private final String RANGE = "range";
    private DateRange dateRange;

    public PartitionMetamorphic(Operation operation) {
        super(operation);
    }

    @Override
    public TestSequence generateQueryMetamorphicTestSequences() {
        List<TestInteraction> testInteractions = new ArrayList<>();
        List<Operation> operations = setValueByPartitionStrategy();
        for (Operation operation : operations) {
            // Create a test interaction from the operation
            TestInteraction testInteraction = new TestInteraction(operation);
            testInteractions.add(testInteraction);
        }
        if(operations.isEmpty()){
            return null;
        }
        Operation operation = operations.get(0);
        // Encapsulate test interaction into test sequence
        TestSequence testSequence = new TestSequence(this, testInteractions);
        String sequenceName = operation.getOperationId().length() > 0 ?
                operation.getOperationId() :
                operation.getMethod().toString() + "-" + operation.getEndpoint();
        testSequence.setName(sequenceName);
        testSequence.appendGeneratedAtTimestampToSequenceName();
        return testSequence;
    }

    public List<Operation> setValueByPartitionStrategy() {
        List<Operation> operationList = new ArrayList<>();
        List<String> completeParams = partition.getOrDefault(COMPLETE, null);
        List<String> rangeParams = partition.getOrDefault(RANGE, null);
        if (completeParams == null && rangeParams == null) {
            logger.info("No completeParams And rangeParams");
            return operationList;
        }
        int strategyIndex = random.nextInt(2);
        if (strategyIndex == 0 && completeParams != null) {
            logger.info("use completeParams");
            int completeParamIndex = random.nextInt(completeParams.size());
            String completeParam = completeParams.get(completeParamIndex);
            // add null
            operationList.add(editableOperation.deepClone().setLeaveValue(null, completeParam));
            //add enum value
            completeParams.remove(completeParamIndex);
            List<Object> values = (List<Object>) apiParamDictionary.get(completeParam);
            for (Object value : values) {
                operationList.add(editableOperation.deepClone().setLeaveValue(value, completeParam));
            }
        } else if (rangeParams != null) {
            logger.info("use rangeParams");
            String startRangeParam = rangeParams.get(0);
            String endRangeParam = rangeParams.get(1);
            String startRangeParamValue = (String) apiParamDictionary.get(startRangeParam);
            String endRangeParamValue = (String) apiParamDictionary.get(endRangeParam);

            generateSourceRangeValue(startRangeParamValue,endRangeParamValue);
            Operation sourceOperation = editableOperation.deepClone();
            sourceOperation.setLeaveValue(DateUtils.getDateFormateStr(dateRange.getStartDate()),startRangeParam);
            sourceOperation.setLeaveValue(DateUtils.getDateFormateStr(dateRange.getEndDate()),endRangeParam);
            operationList.add(sourceOperation);

            Date middleDate = DateUtils.getDateBetweenStartAndEndDate(dateRange.getStartDate(),dateRange.getEndDate());

            Operation startToMiddleOperation = sourceOperation.deepClone();
            startToMiddleOperation.setLeaveValue(DateUtils.getDateFormateStr(middleDate),endRangeParam);
            operationList.add(startToMiddleOperation);

            Operation middleTOEndOperation = sourceOperation.deepClone();
            middleTOEndOperation.setLeaveValue(DateUtils.getDateFormateStr(middleDate),startRangeParam);
            operationList.add(middleTOEndOperation);
        }
        return operationList;
    }
    public void generateSourceRangeValue(String startRangeParamValue, String endRangeParamValue){
        Date startDate;
        Date endDate;
        if(startRangeParamValue == null || endRangeParamValue == null){
            startDate = DateUtils.getDefaultStartDateStr();
            endDate = DateUtils.getDefaultEndDateStr();
            dateRange = new DateRange(startDate,endDate);
        }else {
            dateRange = new DateRange(DateUtils.StrToDate(startRangeParamValue),DateUtils.StrToDate(endRangeParamValue));
        }
    }

    public TestSequence generateOriginalQueryMetamorphicTest(Operation operation) {
        // Create a test interaction from the operation
        TestInteraction testInteraction = new TestInteraction(operation);

        // Encapsulate test interaction into test sequence
        TestSequence testSequence = new TestSequence(this, testInteraction);
        String sequenceName = operation.getOperationId().length() > 0 ?
                operation.getOperationId() :
                operation.getMethod().toString() + "-" + operation.getEndpoint();
        testSequence.setName(sequenceName);
        testSequence.appendGeneratedAtTimestampToSequenceName();
        // Create and return test sequence containing the test interaction
        return testSequence;
    }

}
