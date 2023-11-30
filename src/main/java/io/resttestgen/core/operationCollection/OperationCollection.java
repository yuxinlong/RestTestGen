package io.resttestgen.core.operationCollection;

import io.resttestgen.boot.Configuration;
import io.resttestgen.core.Environment;
import io.resttestgen.core.datatype.HttpMethod;
import io.resttestgen.core.openapi.OpenApi;
import io.resttestgen.core.openapi.Operation;
import io.resttestgen.core.operationdependencygraph.OperationDependencyGraph;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationCollection {
    private static final Logger logger = LogManager.getLogger(OperationCollection.class);
    private final Configuration configuration = Environment.getInstance().getConfiguration();
    private final HttpMethodOperations httpMethodOperations = new HttpMethodOperations();

    public OperationCollection(OpenApi openApi){
        logger.debug("Collecting operations from OpenAPI specification.");
        openApi.getOperations().forEach(httpMethodOperations::addOperation);
    }
}
