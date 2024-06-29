package io.resttestgen.boot.cli;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiParamConfiguration {
    private Map<String, Object> valueMap;
    private Map<String,List<String>> subset;
    private Map<String,List<String>> partition;
    private List<String> equality;

    public List<String> getEquality() {
        return equality;
    }

    public Map<String, List<String>> getSubset() {
        return subset;
    }

    public Map<String, List<String>> getPartition() {
        return partition;
    }

    public Map<String, Object> getValueMap() {
        return valueMap;
    }


    public ApiParamConfiguration(Map<String, Object> apiParamMap) {
        valueMap = new HashMap<>();
        valueMap.putAll(apiParamMap);
        subset = (Map<String, List<String>>)valueMap.get("subset");
        partition = (Map<String, List<String>>)valueMap.get("partition");
        equality = (List<String>)valueMap.get("equality");

    }
    public String getTotalParamName(){
        return (String)valueMap.get("total");
    }

}
