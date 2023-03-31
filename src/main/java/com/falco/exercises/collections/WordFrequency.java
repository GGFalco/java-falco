package com.falco.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> uniques = new HashMap<>();

        ArrayList<String> words = new ArrayList<>();

        for (String line : getLines(filename)) {
            words.addAll(lineToWords(line));
        }

        for (String word : words) {
            uniques.put(word, Collections.frequency(words, word));
        }

        return uniques;
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
