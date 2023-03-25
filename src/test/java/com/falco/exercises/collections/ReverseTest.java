package com.falco.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {

        assertTrue(new ArrayList<String>(List.of("World", "Hello")).equals(Reverse.reverse(new ArrayList<String>(List.of("Hello", "World")))));
    }
}