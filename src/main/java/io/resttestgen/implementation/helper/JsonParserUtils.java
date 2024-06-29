package io.resttestgen.implementation.helper;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonParserUtils {
    public static long findTotal(JsonObject jsonObject,String totalParamName){
        for (String key : jsonObject.keySet()) {
            JsonElement value = jsonObject.get(key);
            if(value.isJsonObject()){
                long total = findTotal(value.getAsJsonObject(),totalParamName);
                if(total>=0){
                    return total;
                }
            }
            if(value.isJsonPrimitive() && key.equals(totalParamName)){
                return value.getAsLong();
            }
        }
        return -1;
    }
}
