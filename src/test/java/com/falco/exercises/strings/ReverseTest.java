package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        assertEquals("oaic", Reverse.reverse("ciao"));
    }
}