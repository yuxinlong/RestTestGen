package io.resttestgen.implementation.metamorphic;

import io.resttestgen.boot.cli.ApiParamConfiguration;
import io.resttestgen.core.Environment;
import io.resttestgen.core.datatype.parameter.Parameter;
import io.resttestgen.core.datatype.parameter.leaves.LeafParameter;
import io.resttestgen.core.datatype.parameter.structured.ArrayParameter;
import io.resttestgen.core.helper.ExtendedRandom;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.testing.Fuzzer;
import io.resttestgen.core.testing.TestSequence;
import io.resttestgen.core.testing.parametervalueprovider.ParameterValueProvider;
import io.resttestgen.core.testing.parametervalueprovider.ParameterValueProviderCachedFactory;
import io.resttestgen.implementation.helper.InterParameterDependenciesHelper;
import io.resttestgen.implementation.parametervalueprovider.ParameterValueProviderType;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static io.resttestgen.core.datatype.parameter.ParameterUtils.getArrays;

public abstract class QueryMetamorphic extends Fuzzer {
    protected Operation editableOperation;
    protected ParameterValueProvider parameterValueProvider =
            ParameterValueProviderCachedFactory.getParameterValueProvider(ParameterValueProviderType.ENUM_AND_EXAMPLE_PRIORITY);
    protected static final ExtendedRandom random = Environment.getInstance().getRandom();
    public final int PROBABILITY_TO_KEEP_A_NON_REQUIRED_LEAF = 10;
    protected ApiParamConfiguration apiParamConfiguration;

    public QueryMetamorphic(Operation operation){
        this.editableOperation = operation.deepClone();
        InterParameterDependenciesHelper idpHelper =
                new InterParameterDependenciesHelper(editableOperation, parameterValueProvider);
        populateArrays();
        idpHelper.extractExampleValuesFromRequiresIpds();
        setValueToLeaves();
        idpHelper.applyInterParameterDependencies();
        getApiParamJson();
    }

    public abstract TestSequence generateQueryMetamorphicTestSequences();
    protected void populateArrays() {
        Collection<ArrayParameter> arrays = editableOperation.getArrays();
        LinkedList<ArrayParameter> queue = new LinkedList<>(arrays);
        while (!queue.isEmpty()) {
            ArrayParameter array = queue.getFirst();
            int n = random.nextShortLength(array.getMinItems(), array.getMaxItems());

            // If not required, remove array with a 0.7 probability
            if (!array.isRequired() && random.nextInt(10) < 8) {
                n = 0;
            }

            for (int i = 0; i < n; i++) {
                Parameter referenceElementCopy = array.getReferenceElement().deepClone();
                array.addElement(referenceElementCopy);
                queue.addAll(getArrays(referenceElementCopy));
            }
            queue.remove(array);
        }
    }
    protected void setValueToLeaves() {
        // Assign values to leaves and remove random non-mandatory leaves
        Collection<LeafParameter> leaves = editableOperation.getLeaves();
        for (LeafParameter leaf : leaves) {

            // If parameter is not mandatory or if it is not part of an array, set value with 25% probability
            // Null parameters will be removed by the request manager
            if (leaf.isRequired() || random.nextInt(100) < PROBABILITY_TO_KEEP_A_NON_REQUIRED_LEAF ||
                    (leaf.getParent() != null && leaf.getParent() instanceof ArrayParameter)) {
                leaf.setValueWithProvider(parameterValueProvider);
            }
        }
    }
    protected void getApiParamJson(){
        Map<String,Object> apiParamMap = Environment.getInstance().getDictionaryMap();
        apiParamConfiguration = new ApiParamConfiguration(apiParamMap);

    }
}
