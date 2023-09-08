package utils;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private static Map<String, Object> contextMap = new HashMap<>();

    public static void setData(String key, Object value) {
        contextMap.put(key, value);
    }

    public static Object getData(String key) {
       return contextMap.get(key);

}



    }
