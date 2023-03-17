package com.falco.exercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseFastTest {
    ReverseFast revFast = new ReverseFast("reverse fast");
    @Test
    void reverse() {
        String s = new String("hello");
        assertEquals("olleh",revFast.reverse(s));
    }
}