package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoYYTest {

    @Test
    void noYY() {
        System.out.println(NoYY.noYY(new ArrayList<>(List.of("a","b", "c"))));
        System.out.println(NoYY.noYY(new ArrayList<>(List.of("a","b", "cy"))));
    }
}