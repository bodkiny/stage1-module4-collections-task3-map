package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        if (sourceMap.isEmpty()) {
            return new HashMap<>();
        }

        HashMap<String, Integer> swappedMap = new HashMap<>(sourceMap.size());

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            swappedMap.computeIfAbsent(entry.getValue(), k -> entry.getKey());
        }

        return swappedMap;
    }
}
