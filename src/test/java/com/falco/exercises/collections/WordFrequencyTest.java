package com.falco.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void wordFrequency() throws IOException {
        assertEquals(Map.of("a",2, "b",1, "c", 3), WordFrequency.wordFrequency("src/main/resources/test2"));
    }
}