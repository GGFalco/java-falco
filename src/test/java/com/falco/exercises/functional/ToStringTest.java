package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ToStringTest {

    @Test
    void testToString() {
        assertEquals("1,2,3", ToString.toString(Stream.of(1,2,3,4,5), 3));
    }
}