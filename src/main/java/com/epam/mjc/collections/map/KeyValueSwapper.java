package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        if (sourceMap.isEmpty()) {
            return new HashMap<>();
        }

        HashMap<String, Integer> swappedMap = new HashMap<>(sourceMap.size());

        Set<Map.Entry<Integer, String>> entries = sourceMap.entrySet();
        TreeSet<Map.Entry<Integer, String>> sortedEntries = new TreeSet<>(Comparator.comparingInt(Map.Entry::getKey));
        sortedEntries.addAll(entries);
        for (Map.Entry<Integer, String> entry : sortedEntries) {
            swappedMap.computeIfAbsent(entry.getValue(), k -> entry.getKey());
        }

        return swappedMap;
    }
}
