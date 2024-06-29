package io.resttestgen.implementation.strategy.testResult;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.resttestgen.core.Environment;
import io.resttestgen.core.helper.TestInteractionType;
import io.resttestgen.core.testing.TestInteraction;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.implementation.helper.JsonParserUtils;
import io.resttestgen.implementation.metamorphic.PartitionMetamorphic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionMetamorphicTestResult extends TestResult {
    private static final Logger logger = LogManager.getLogger(SubSetMetamorphicTestResult.class);

    public PartitionMetamorphicTestResult() {
        this.testSequences = new ArrayList<>();
    }

    @Override
    public List<TestSequence> getErrorTestSequence() {
        return this.testSequences.stream().filter(this::isInconsistentPartition).collect(Collectors.toList());
    }

    public boolean isInconsistentPartition(TestSequence testSequence) {
        String totalParamName = this.getTotalParamName();
        List<TestInteraction> testInteractions = testSequence.getTestInteractions();
        if (testInteractions.isEmpty()) {
            String errorMsg = String.format("TestSequence: %s testInteractions is empty", testSequence.getName());
            logger.error(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        TestInteraction source = null;
        List<TestInteraction> metamorphicList = new ArrayList<>();
        for (TestInteraction testInteraction : testInteractions) {
            if (testInteraction.getType() == TestInteractionType.source) {
                source = testInteraction;
            } else {
                metamorphicList.add(testInteraction);
            }
        }
        Gson gson = new Gson();
        if (source == null) {
            String errorMsg = "PartitionMetamorphicTestResult's source is null";
            logger.error(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        JsonObject sourceResponse = gson.fromJson(source.getResponseBody(), JsonObject.class);
        long sourceTotal = 0;
        if(sourceResponse!=null){
            sourceTotal = JsonParserUtils.findTotal(sourceResponse,totalParamName);
        }
        if (metamorphicList.isEmpty()) {
            String errorMsg = "PartitionMetamorphicTestResult's source is null";
            logger.error(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        long metamorphicTotal = 0;
        for (TestInteraction metamorphic : metamorphicList) {
            if (metamorphic == null) {
                String errorMsg = "PartitionMetamorphicTestResult's metamorphic is null";
                logger.error(errorMsg);
                throw new RuntimeException(errorMsg);
            }
            JsonObject metamorphicResponse = gson.fromJson(metamorphic.getResponseBody(), JsonObject.class);
            if(metamorphicResponse!=null){
                metamorphicTotal += JsonParserUtils.findTotal(metamorphicResponse,totalParamName);
            }
        }
        return metamorphicTotal != sourceTotal;
    }
}
