package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();

        if (!sentence.isBlank()) {
            String[] words = sentence.toLowerCase().split("\\W");

            for (String word : words) {
                if (!word.isBlank()) {
                    wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        return wordsCount;
    }
}
