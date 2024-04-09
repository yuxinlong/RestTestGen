package io.resttestgen.implementation.metamorphic;

import io.resttestgen.core.Environment;
import io.resttestgen.core.helper.TestInteractionType;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.TestInteraction;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.implementation.strategy.PartitionQueryTestStrategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class SubSetMetamorphic extends QueryMetamorphic {
    private static final Logger logger = LogManager.getLogger(PartitionQueryTestStrategy.class);

    private Map<String, Object> apiParamDictionary = apiParamConfiguration.getValueMap();
    private Map<String, List<String>> subset = apiParamConfiguration.getSubset();
    private final String NULLORONE = "nullOrOne";
    private final String ONEORMORE = "oneOrMore";

    public SubSetMetamorphic(Operation operation) {
        super(operation);
    }

    @Override
    public TestSequence generateQueryMetamorphicTestSequences() {

        List<TestInteraction> testInteractions = setValueBySubsetStrategy();
        if(testInteractions.isEmpty()){
            return null;
        }
        // Encapsulate test interaction into test sequence
        TestSequence testSequence = new TestSequence(this, testInteractions);
        String sequenceName = this.editableOperation.getOperationId().length() > 0 ?
                this.editableOperation.getOperationId() :
                this.editableOperation.getMethod().toString() + "-" + this.editableOperation.getEndpoint();
        testSequence.setName(sequenceName);
        testSequence.appendGeneratedAtTimestampToSequenceName();
        return testSequence;
    }

    public List<TestInteraction> setValueBySubsetStrategy() {
        List<TestInteraction> testInteractions = new ArrayList<>();
        List<String> nullOrOneParams = subset.getOrDefault(NULLORONE, null);
        List<String> oneOrMoreParams = subset.getOrDefault(ONEORMORE, null);
        if ((nullOrOneParams == null || nullOrOneParams.size()<1) && (oneOrMoreParams == null || oneOrMoreParams.size()<1)) {
            logger.info("No nullOrOneParams And oneOrMoreParams");
            return testInteractions;
        }
        int strategyIndex = random.nextInt(2);
        if (strategyIndex == 0 && nullOrOneParams != null) {
            logger.info("use nullOrOneParams");
            int nullOrOneParamIndex = random.nextInt(nullOrOneParams.size());
            String nullOrOneParam = nullOrOneParams.get(nullOrOneParamIndex);
//            nullOrOneParams.remove(nullOrOneParamIndex);
            // add null
            TestInteraction sourceTestInteraction =
                    new TestInteraction(editableOperation.deepClone().setLeaveValue(null, nullOrOneParam),
                            TestInteractionType.source);
            testInteractions.add(sourceTestInteraction);
            //add random value
            List<Object> values = (List<Object>) apiParamDictionary.get(nullOrOneParam);
            Object value = values.get(random.nextInt(values.size()));
            TestInteraction subSetTestInteraction =
                    new TestInteraction(editableOperation.deepClone().setLeaveValue(value, nullOrOneParam),
                            TestInteractionType.metamorphic);
            testInteractions.add(subSetTestInteraction);
        } else if (strategyIndex == 1 && oneOrMoreParams != null) {
            logger.info("use oneOrMoreParams");
            int metamorphicParamIndex = random.nextInt(oneOrMoreParams.size());
            String metamorphicParam = oneOrMoreParams.get(metamorphicParamIndex);
//            oneOrMoreParams.remove(metamorphicParamIndex);
//            for (String oneOrMoreParam : oneOrMoreParams) {
//                Map<String, List<String>> interParamMap = (Map<String, List<String>>) apiParamDictionary.get(metamorphicParam);
//                List<String> interParams = interParamMap.get("item");
//                editableOperation.setLeaveValue(generateSourceSetValue(interParams), oneOrMoreParam);
//            }
            Map<String, List<String>> interParamMap = (Map<String, List<String>>) apiParamDictionary.get(metamorphicParam);

            List<String> interParams = interParamMap.get("item");
            List<String> interParamsCopy = new ArrayList<>(interParams);
            String sourceValue = generateSourceSetValue(interParamsCopy);
            String subsetValue = generateSubSetValue(interParamsCopy, sourceValue);
            TestInteraction sourceTestInteraction =
                    new TestInteraction(editableOperation.deepClone().setLeaveValue(sourceValue, metamorphicParam),
                            TestInteractionType.source);
            TestInteraction subSetTestInteraction =
                    new TestInteraction(editableOperation.deepClone().setLeaveValue(subsetValue, metamorphicParam),
                            TestInteractionType.metamorphic);
            testInteractions.add(sourceTestInteraction);
            testInteractions.add(subSetTestInteraction);
        }
        return testInteractions;
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

    public String generateSourceSetValue(List<String> interParams) {
        StringBuilder sb = new StringBuilder();
        int sourceParamIndex = random.nextInt(interParams.size());
        String interParam = interParams.get(sourceParamIndex);
        interParams.remove(sourceParamIndex);
        List<Object> param = (List<Object>) apiParamDictionary.get(interParam);
        sb.append(interParam).append(":").append(param.get(random.nextInt(param.size())));
        return sb.toString();
    }

    public String generateSubSetValue(List<String> interParams, String sourceParam) {
        StringBuilder sb = new StringBuilder(sourceParam);
        String interParam = interParams.get(random.nextInt(interParams.size()));
        List<Object> param = (List<Object>) apiParamDictionary.get(interParam);
        sb.append("&").append(interParam).append(":").append(param.get(random.nextInt(param.size())));
        return sb.toString();
    }
}
