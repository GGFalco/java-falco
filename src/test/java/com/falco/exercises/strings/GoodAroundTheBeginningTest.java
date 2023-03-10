package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @Test
    void goodAroundTheBeginning() {
        assertEquals(true, GoodAroundTheBeginning.goodAroundTheBeginning("good String"));
        assertEquals(true, GoodAroundTheBeginning.goodAroundTheBeginning(" good String"));
        assertEquals(false, GoodAroundTheBeginning.goodAroundTheBeginning("ood String"));
    }
}