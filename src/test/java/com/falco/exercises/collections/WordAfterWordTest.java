package com.falco.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordAfterWordTest {

    @Test
    void wordAfterWord() throws IOException {
        final String filename = "src/main/resources/test";
        assertEquals("ciao", WordAfterWord.wordAfterWord(filename,"a"));
    }
}