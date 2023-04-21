package com.falco.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppendTest {

    @Test
    void append() {
        List<Integer> src = new ArrayList<>(List.of(1,2,3,4));
        List<Integer> dst = new ArrayList<>(List.of());
        Append.append(dst,src);
        assertTrue(dst.equals(List.of(1,2,3,4)));
    }
}