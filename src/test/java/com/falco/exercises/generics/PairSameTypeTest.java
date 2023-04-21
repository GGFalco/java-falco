package com.falco.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairSameTypeTest {

    @Test
    void swap() {
        PairSameType p = new PairSameType(1,2);
        p.swap();
        PairSameType p2 = new PairSameType(2,1);
        assertTrue(p2.equals(p));
    }
}