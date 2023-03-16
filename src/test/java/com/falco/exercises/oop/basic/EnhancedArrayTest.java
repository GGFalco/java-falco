package com.falco.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedArrayTest {

    EnhancedArray v;

    @BeforeEach
    void setUp(){
        v = new EnhancedArray(3);
        v.array[0] = 2;
        v.array[1] = 1;
        v.array[2] = 3;
    }
    @Test
    void size() {
        assertEquals(3, v.size());
    }

    @Test
    void get() {
        assertEquals(3, v.get(2));
    }

    @Test
    void contains() {
        assertEquals(true, v.contains(3));
    }

    @Test
    void toArray() {
        assertArrayEquals(new int[]{2,1,3}, v.toArray());
    }
}