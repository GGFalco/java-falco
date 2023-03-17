package com.falco.exercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSlowTest {

    @Test
    void reverse() {
        ReverseSlow revSlow = new ReverseSlow("ok");
        String s = new String("hello");

        assertEquals("olleh", revSlow.reverse(s));
    }
}