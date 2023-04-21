package com.falco.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AppendBoundedTest {

    @Test
    void append() {

        List<Object> father = new ArrayList<>();
        List<Integer> son  = new ArrayList<>(List.of(1,2,3));
        AppendBounded.append(father,son);
        assertTrue(List.of(1,2,3).equals(father));

    }
}