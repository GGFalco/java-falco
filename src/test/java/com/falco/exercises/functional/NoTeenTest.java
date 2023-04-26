package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoTeenTest {

    @Test
    void noTeen() {

        System.out.println(NoTeen.noTeen(new ArrayList<>(List.of(12, 13, 19, 20))));
        System.out.println(NoTeen.noTeen(new ArrayList<>(List.of(1, 14, 1))));
    }
}