package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import java.lang.reflect.GenericSignatureFormatError;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertEquals(true, GoodAtTheBeginning.goodAtTheBeginning("good String"));
        assertEquals(false, GoodAtTheBeginning.goodAtTheBeginning(" good String"));
        assertEquals(false, GoodAtTheBeginning.goodAtTheBeginning("ood String"));
    }
}