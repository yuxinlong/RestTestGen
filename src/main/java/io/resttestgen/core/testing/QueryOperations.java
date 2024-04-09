package io.resttestgen.core.testing;

import io.resttestgen.core.Environment;
import io.resttestgen.core.datatype.HttpMethod;
import io.resttestgen.core.openapi.OpenApi;
import io.resttestgen.core.openapi.Operation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class QueryOperations {

    private LinkedList<Operation> queryOperationsWithoutFilter = new LinkedList<>();
    private LinkedList<Operation> queryOperationsWithFilter = new LinkedList<>();

    public void initQueryOperations(Environment environment){
        OpenApi openApi = environment.getOpenAPI();
        List<Operation> queryOperation = openApi.getOperations().stream()
                .filter(operation -> operation.getMethod().equals(HttpMethod.GET)).collect(Collectors.toList());
        for (Operation operation : queryOperation) {
            if(operation.getHasFilter()){
                queryOperationsWithFilter.add(operation);
            }else {
                queryOperationsWithoutFilter.add(operation);
            }
        }
    }

    public LinkedList<Operation> getQueryOperationsWithoutFilter() {
        return queryOperationsWithoutFilter;
    }

    public void setQueryOperationsWithoutFilter(LinkedList<Operation> queryOperationsWithoutFilter) {
        this.queryOperationsWithoutFilter = queryOperationsWithoutFilter;
    }

    public LinkedList<Operation> getQueryOperationsWithFilter() {
        return queryOperationsWithFilter;
    }

    public void setQueryOperationsWithFilter(LinkedList<Operation> queryOperationsWithFilter) {
        this.queryOperationsWithFilter = queryOperationsWithFilter;
    }

}
