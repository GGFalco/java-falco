package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualIsNotTest {

    @Test
    void equalIsNot() {

        assertEquals(false, EqualIsNot.equalIsNot("This is not"));
        assertEquals(true, EqualIsNot.equalIsNot("This is notnot"));
        assertEquals(true, EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
    }
}