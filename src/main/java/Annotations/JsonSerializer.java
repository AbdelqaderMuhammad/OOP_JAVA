package Annotations;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializer {

    public String serialize(Object obj) {
        Class<?> cl = Objects.requireNonNull(obj).getClass();
        Map<String, String> jsonMap = new HashMap<>();

        // check if marked serializable
        if (!cl.isAnnotationPresent(Serializable.class)) {
            throw new IllegalStateException("not serializable");
        }

        for (Field f: cl.getDeclaredFields()) {
            f.setAccessible(true);
            if (f.isAnnotationPresent(JsonField.class)) {
                String key = getSerializeKey(f);
                String value = null;
                try {
                    value = (String) f.get(obj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                jsonMap.put(key, value);
            }
        }

        return toJsonString(jsonMap);
    }

    private String toJsonString (Map<String, String> jsonMap) {
        String json = jsonMap.entrySet().stream()
                .map( entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"" )
                .collect(Collectors.joining(","));
        return "{" + json + "}" ;
    }


    private String getSerializeKey(Field f) {
        String key = f.getAnnotation(JsonField.class).key();
        if ( key.isEmpty() ) {
            return f.getName();
        } else {
            return key ;
        }
    }
}
