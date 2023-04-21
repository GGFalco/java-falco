package com.falco.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {

        List<Integer> reverseMe = new ArrayList<>(List.of(1,2));
        Reverse.reverse(reverseMe);
        assertTrue(List.of(2,1).equals(reverseMe));
    }
}