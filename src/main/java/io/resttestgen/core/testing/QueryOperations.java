package io.resttestgen.core.testing;

import io.resttestgen.core.Environment;
import io.resttestgen.core.datatype.HttpMethod;
import io.resttestgen.core.openapi.OpenApi;
import io.resttestgen.core.openapi.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QueryOperations {

    private List<Operation> queryOperationsWithoutFilter = new ArrayList<>();
    private List<Operation> queryOperationsWithFilter = new ArrayList<>();

    //获取api中的查询接口并且分离具有和不具有过滤字段的查询接口
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

    public List<Operation> getQueryOperationsWithoutFilter() {
        return queryOperationsWithoutFilter;
    }

    public void setQueryOperationsWithoutFilter(List<Operation> queryOperationsWithoutFilter) {
        this.queryOperationsWithoutFilter = queryOperationsWithoutFilter;
    }

    public List<Operation> getQueryOperationsWithFilter() {
        return queryOperationsWithFilter;
    }

    public void setQueryOperationsWithFilter(List<Operation> queryOperationsWithFilter) {
        this.queryOperationsWithFilter = queryOperationsWithFilter;
    }

}
