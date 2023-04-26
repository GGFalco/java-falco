package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PayMoreTest {

    @Test
    void payMore() {
        Map<String, Double> fees = new HashMap<>(Map.of("34745..." , 11.75, "33367..." , 9.75, "34833..." , 7.75,
                "33188..." , 7.75,
                "33112..." , 7.95));

        PayMore.payMore(fees,"333",+10);
        System.out.println(fees);
    }
}