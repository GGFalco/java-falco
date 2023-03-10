package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @Test
    void removeFirstLast() {
        assertEquals("oo", RemoveFirstLast.removeFirstLast("eooe"));
        assertEquals("", RemoveFirstLast.removeFirstLast(""));
        assertEquals("", RemoveFirstLast.removeFirstLast("FF"));
        assertEquals("F", RemoveFirstLast.removeFirstLast("F"));
    }
}