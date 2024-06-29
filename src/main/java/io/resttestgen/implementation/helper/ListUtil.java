package io.resttestgen.implementation.helper;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    public static List<Object> deepCloneList(List<Object> list){
        return new ArrayList<>(list);
    }
}
