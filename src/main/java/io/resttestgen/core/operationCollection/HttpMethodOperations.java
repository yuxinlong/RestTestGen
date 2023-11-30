package io.resttestgen.core.operationCollection;

import io.resttestgen.core.datatype.HttpMethod;
import io.resttestgen.core.openapi.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class HttpMethodOperations {
    private List<Operation> getOperations;
    private List<Operation> postOperations;
    private List<Operation> putOperations;
    private List<Operation> deleteOperations;
    private List<Operation> patchOperations;

    public HttpMethodOperations() {
        this.getOperations = new ArrayList<>();
        this.postOperations = new ArrayList<>();
        this.putOperations = new ArrayList<>();
        this.deleteOperations = new ArrayList<>();
        this.patchOperations = new ArrayList<>();
    }

    private static final Logger logger = LogManager.getLogger(HttpMethodOperations.class);

    public List<Operation> getGetOperations() {
        return getOperations;
    }

    public void setGetOperations(List<Operation> getOperations) {
        this.getOperations = getOperations;
    }

    public List<Operation> getPostOperations() {
        return postOperations;
    }

    public void setPostOperations(List<Operation> postOperations) {
        this.postOperations = postOperations;
    }

    public List<Operation> getPutOperations() {
        return putOperations;
    }

    public void setPutOperations(List<Operation> putOperations) {
        this.putOperations = putOperations;
    }

    public List<Operation> getDeleteOperations() {
        return deleteOperations;
    }

    public void setDeleteOperations(List<Operation> deleteOperations) {
        this.deleteOperations = deleteOperations;
    }

    public List<Operation> getPatchOperations() {
        return patchOperations;
    }

    public void setPatchOperations(List<Operation> patchOperations) {
        this.patchOperations = patchOperations;
    }

    public void addOperation(Operation operation){
        switch (operation.getMethod()){
            case GET:
                this.getOperations.add(operation);
                break;
            case POST:
                this.postOperations.add(operation);
                break;
            case PUT:
                this.putOperations.add(operation);
                break;
            case DELETE:
                this.deleteOperations.add(operation);
                break;
            case PATCH:
                this.patchOperations.add(operation);
                break;
            default:
                logger.warn("操作:"+operation.getMethod()+"目前不支持分类处理");
        }

    }
}
