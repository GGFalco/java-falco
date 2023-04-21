package com.falco.exercises.generics;

import com.falco.exercises.generics.IterableToString;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IterableToStringTest {

    @Test
    void iterableToString() {
        assertEquals("1, 2, 3, ", IterableToString.iterableToString(List.of(1,2,3)));
        assertEquals("a, b, c, ", IterableToString.iterableToString(List.of("a", "b", "c")));
    }
}