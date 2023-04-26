package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JustPrintParametrizedTest {

    @Test
    void justPrintList() {
        JustPrintParametrized.justPrintList(List.of("Marco", "Matteo", "Luca", "Giovanni"),
                (a) -> System.out.println("Hello " + a + "!"));
    }

    @Test
    void justPrintMap() {
        JustPrintParametrized.justPrintMap(Map.of(1, "nicola", 2, "agata", 3, "darma", 4, "marzia"),
                (a,b) -> System.out.println("K: " + a + ", V: " + b));
    }
}