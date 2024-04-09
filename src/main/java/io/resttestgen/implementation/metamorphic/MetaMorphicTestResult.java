package io.resttestgen.implementation.metamorphic;

import io.resttestgen.core.testing.TestSequence;

import java.util.List;

public class MetaMorphicTestResult {
    private int successResultTotal;
    private int failResultTotal;

    public int getSuccessResultTotal() {
        return successResultTotal;
    }

    public void setSuccessResultTotal(int successResultTotal) {
        this.successResultTotal = successResultTotal;
    }

    public int getFailResultTotal() {
        return failResultTotal;
    }

    public void setFailResultTotal(int failResultTotal) {
        this.failResultTotal = failResultTotal;
    }
}
