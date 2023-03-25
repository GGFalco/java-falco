package com.falco.exercises.collections;

import java.util.Map;
import java.util.Set;

public class ValuesKeys {

    public static boolean valuesKeys(Map<String, String> map) {
        String[] keys = map.keySet().toArray(new String[0]);
        String[] values = map.values().toArray(new String[0]);

        for (int i = 0; i < map.size(); i++) {
            if (map.containsKey(values[i])) {
                return true;
            }
        }

        return false;
    }
}
