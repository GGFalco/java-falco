package com.falco.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureTest {

    @Test
    void max() {
        Integer[] array = new Integer[]{1, 3, 2};
        assertEquals(3, Measure.max(array, new Measurer<Integer>() {
            @Override
            public double measure(Integer obj) {
                return obj;
            }
        }));
    }

    @Test
    void min() {
        Integer[] array = new Integer[]{1,3,2};
        assertEquals(1, Measure.min(array, new Measurer<Integer>() {
            @Override
            public double measure(Integer obj) {
                return obj;
            }
        }));
    }
}