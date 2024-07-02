package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Set<Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.contains(requiredValue);
    }

    private Set<Integer> calculateFunctionMap(List<Integer> sourceList) {
        return sourceList.stream()
                .map(this::function)
                .collect(Collectors.toSet());
    }

    private int function(int x) {
        return 5 * x + 2;
    }
}
