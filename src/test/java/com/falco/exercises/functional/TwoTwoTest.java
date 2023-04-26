package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoTwoTest {

    @Test
    void twoTwo() {
        System.out.println(TwoTwo.twoTwo(new ArrayList<>(List.of(1,2,3))));
        System.out.println(TwoTwo.twoTwo(new ArrayList<>(List.of(2,6,11))));
        System.out.println(TwoTwo.twoTwo(new ArrayList<>(List.of(0))));
    }
}