package io.resttestgen.implementation.strategy.testResult;

import io.resttestgen.boot.cli.ApiParamConfiguration;
import io.resttestgen.core.Environment;
import io.resttestgen.core.testing.TestSequence;

import java.util.List;

public abstract class TestResult {
    protected List<TestSequence> testSequences;

    public void addTestSequence(TestSequence testSequence){
        this.testSequences.add(testSequence);
    }
    public abstract List<TestSequence> getErrorTestSequence();
    private static Environment environment = Environment.getInstance();
    public String getTotalParamName(){
        ApiParamConfiguration apiParamConfiguration =  environment.getApiParamConfiguration();
        return apiParamConfiguration.getTotalParamName();
    }
}
