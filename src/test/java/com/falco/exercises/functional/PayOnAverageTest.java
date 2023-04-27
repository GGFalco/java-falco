package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PayOnAverageTest {

    @Test
    void payOnAverage() {
        Map<String, Double> fees = Map.of(
                "34745...", 11.75,
                "33367...", 9.75,
                "34833...", 7.75,
                "33188...", 7.75,
                "33112...", 7.95);

        System.out.println(PayOnAverage.payOnAverage(fees));
    }
}