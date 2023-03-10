package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        assertEquals("HelloWorld", Concatenate.concatenate(new String[]{"Hello", "World"}));
    }
}