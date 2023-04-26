package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFiveTest {

    @Test
    void squareFive() {
        System.out.println(SquareFive.squareFive(new ArrayList<>(List.of(3,1,4))));
        System.out.println(SquareFive.squareFive(new ArrayList<>(List.of(1))));
        System.out.println(SquareFive.squareFive(new ArrayList<>(List.of(5))));
    }
}