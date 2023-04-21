package com.falco.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesTest {

    @Test
    void countOccurrences() {

        assertEquals(2, CountOccurrences.countOccurrences(new Integer[]{1,2,2},2));
        assertEquals(2, CountOccurrences.countOccurrences(new Integer[]{null,null,2},null));
    }
}