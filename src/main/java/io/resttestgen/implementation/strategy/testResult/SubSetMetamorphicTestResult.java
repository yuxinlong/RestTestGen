package io.resttestgen.implementation.strategy.testResult;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.resttestgen.core.helper.TestInteractionType;
import io.resttestgen.core.testing.TestInteraction;
import io.resttestgen.core.testing.TestRunner;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.implementation.helper.JsonParserUtils;
import io.resttestgen.implementation.strategy.PartitionQueryTestStrategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubSetMetamorphicTestResult extends TestResult {
    private static final Logger logger = LogManager.getLogger(SubSetMetamorphicTestResult.class);

    public SubSetMetamorphicTestResult(){
        this.testSequences = new ArrayList<>();
    }

    @Override
    public List<TestSequence> getErrorTestSequence() {
        return this.testSequences.stream().filter(this::isInconsistentSubSet).collect(Collectors.toList());
    }
    public boolean isInconsistentSubSet(TestSequence testSequence){
        String totalParamName = this.getTotalParamName();
        List<TestInteraction> testInteractions = testSequence.getTestInteractions();
        if(testInteractions.isEmpty()){
            String errorMsg = String.format("TestSequence: %s testInteractions is empty",testSequence.getName());
            logger.error(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        TestInteraction source = null;
        TestInteraction metamorphic = null;
        for (TestInteraction testInteraction : testInteractions) {
            if(testInteraction.getType() == TestInteractionType.source){
                source  = testInteraction;
            }else {
                metamorphic = testInteraction;
            }
        }
        Gson gson = new Gson();
        if(source == null){
            String errorMsg = "SubSetMetamorphicTestResult's source is null";
            logger.error(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        JsonObject sourceResponse = gson.fromJson(source.getResponseBody(),JsonObject.class);
        long sourceTotal = 0;
        if(sourceResponse!=null){
            sourceTotal  = JsonParserUtils.findTotal(sourceResponse,totalParamName);
        }
        if(metamorphic == null){
            String errorMsg = "SubSetMetamorphicTestResult's metamorphic is null";
            logger.error(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        JsonObject metamorphicResponse = gson.fromJson(metamorphic.getResponseBody(),JsonObject.class);
        long metamorphicTotal = 0;
        if(metamorphicResponse!=null){
            metamorphicTotal = JsonParserUtils.findTotal(metamorphicResponse,totalParamName);
        }
        return metamorphicTotal>sourceTotal;
    }
}
