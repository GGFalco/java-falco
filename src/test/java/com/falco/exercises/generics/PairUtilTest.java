package com.falco.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairUtilTest {

    @Test
    void swap() {
        Pair<Integer, Double> p1 = new Pair<>(1,2.0);
        Pair<Double, Integer> p2 = new Pair<>(2.0,1);

        assertEquals(p2.getFirst(), p1.getSecond());
        assertEquals(p1.getFirst(), p2.getSecond());
    }
}