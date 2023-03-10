package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharsTest {

    @Test
    void duplicateChars() {
        char[] ee = {'e', 'l', 'w'};
        assertArrayEquals(ee, DuplicateChars.duplicateChars("whistleblower"));
    }
}