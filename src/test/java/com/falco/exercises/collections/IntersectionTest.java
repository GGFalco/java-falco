package com.falco.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    void intersection() {
        Set<Integer> test = Intersection.intersection(new HashSet<>(List.of(1, 2, 3)), new HashSet<>(List.of(3, 4, 5)));
        assertTrue(test.equals(new HashSet<>(List.of(3))));
    }
}