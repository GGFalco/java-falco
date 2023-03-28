package com.falco.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {

    @Test
    void eratosthenes() {
        assertEquals(Set.of(1,2,3,5,7), Eratosthenes.eratosthenes(7));
    }
}