package io.resttestgen.implementation.metamorphic;

import io.resttestgen.core.helper.TestInteractionType;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.TestInteraction;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.implementation.helper.ListUtil;
import io.resttestgen.implementation.strategy.PartitionQueryTestStrategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EqualityMetamorphic extends QueryMetamorphic{

    private static final Logger logger = LogManager.getLogger(PartitionQueryTestStrategy.class);

    private Map<String, Object> apiParamDictionary = apiParamConfiguration.getValueMap();
    private List<String> equality = apiParamConfiguration.getEquality();

    public EqualityMetamorphic(Operation operation) {
        super(operation);
    }

    @Override
    public TestSequence generateQueryMetamorphicTestSequences() {

        List<TestInteraction> testInteractions = setValueByEqualityStrategy();
        if (testInteractions.isEmpty()) {
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
    public List<TestInteraction> setValueByEqualityStrategy() {
        List<TestInteraction> testInteractions = new ArrayList<>();


        if(!equality.isEmpty()){
            int paramIndex =  equality.size();
            String equalityParam = equality.get(random.nextInt(paramIndex));
            List<Object> values = (List<Object>) apiParamDictionary.getOrDefault(equalityParam,null);
            if(values == null || values.isEmpty()){
                logger.info("equalityParams not values");
            }
            List<Object> deepCloneValues = ListUtil.deepCloneList(values);
            Object sourceValue = generateSourceValue(deepCloneValues);
            TestInteraction sourceTestInteraction =
                    new TestInteraction(editableOperation.deepClone().setLeaveValue(sourceValue, equalityParam),
                            TestInteractionType.source);
            testInteractions.add(sourceTestInteraction);
            Object metamorphicValue = generateMetamorphicValue(deepCloneValues);
            TestInteraction equalityTestInteraction =
                    new TestInteraction(editableOperation.deepClone().setLeaveValue(metamorphicValue, equalityParam),
                            TestInteractionType.metamorphic);
            testInteractions.add(equalityTestInteraction);
        }else{
            logger.info("no equalityParams");
        }
        return testInteractions;
    }
    public Object generateSourceValue(List<Object> values){
        int valueIndex = random.nextInt(values.size());
        Object sourceValue = values.get(valueIndex);
        values.remove(valueIndex);
        return sourceValue;
    }
    public Object generateMetamorphicValue(List<Object> values){
        int valueIndex = random.nextInt(values.size());
        Object metamorphicValue = values.get(valueIndex);
        values.remove(valueIndex);
        return metamorphicValue;
    }
}
