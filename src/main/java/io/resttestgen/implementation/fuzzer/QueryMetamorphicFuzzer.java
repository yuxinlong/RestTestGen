package io.resttestgen.implementation.fuzzer;

import io.resttestgen.core.Environment;
import io.resttestgen.core.helper.ExtendedRandom;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.parametervalueprovider.ParameterValueProvider;
import io.resttestgen.core.testing.parametervalueprovider.ParameterValueProviderCachedFactory;
import io.resttestgen.implementation.parametervalueprovider.ParameterValueProviderType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QueryMetamorphicFuzzer {
    private static final Logger logger = LogManager.getLogger(NominalFuzzer.class);
    private static final ExtendedRandom random = Environment.getInstance().getRandom();

    private final Operation operation;
    private Operation editableOperation;
    private ParameterValueProvider parameterValueProvider =
            ParameterValueProviderCachedFactory.getParameterValueProvider(ParameterValueProviderType.ENUM_AND_EXAMPLE_PRIORITY);
    private boolean strict = false;

    public final int PROBABILITY_TO_KEEP_A_NON_REQUIRED_LEAF = 10;

    public QueryMetamorphicFuzzer(Operation operation) {
        this.operation = operation;
    }
}
