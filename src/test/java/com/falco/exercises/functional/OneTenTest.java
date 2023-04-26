package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OneTenTest {

    @Test
    void oneTen() {
        System.out.println(OneTen.oneTen(new ArrayList<>(List.of(1,2,3))));
    }
}