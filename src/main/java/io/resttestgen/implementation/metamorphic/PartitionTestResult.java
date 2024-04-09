package io.resttestgen.implementation.metamorphic;

import io.resttestgen.core.testing.TestSequence;

import java.util.List;

public class PartitionTestResult extends MetaMorphicTestResult{
    private List<List<TestSequence>> successTestResult;
    private List<List<TestSequence>> failTestResult;

    public List<List<TestSequence>> getSuccessTestResult() {
        return successTestResult;
    }

    public void setSuccessTestResult(List<List<TestSequence>> successTestResult) {
        this.successTestResult = successTestResult;
    }

    public List<List<TestSequence>> getFailTestResult() {
        return failTestResult;
    }

    public void setFailTestResult(List<List<TestSequence>> failTestResult) {
        this.failTestResult = failTestResult;
    }
}
