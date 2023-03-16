package com.falco.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedResizableArrayTest {
    EnhancedResizableArray v;

    @BeforeEach
    void setUp(){
        v = new EnhancedResizableArray();
        v.add(0);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
    }
    @Test
    void add() {
        assertArrayEquals(new int[]{0,1,2,3,4}, v.toArray());
    }

    @Test
    void remove() {
        v.remove(2);
        assertArrayEquals(new int[]{0,1,3,4}, v.toArray());
    }

    @Test
    void get() {
        assertEquals(1, v.get(1));
    }

    @Test
    void set() {
        v.set(0,1);
        assertArrayEquals(new int[]{1,1,2,3,4}, v.toArray());
    }

    @Test
    void contains() {
        assertEquals(true, v.contains(3));
    }

    @Test
    void size() {
        assertEquals(5,v.size());
    }

    @Test
    void toArray() {
        assertArrayEquals(new int[]{0,1,2,3,4}, v.toArray());
    }
}