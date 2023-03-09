package com.falco.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClickCounterTest {

    @Test
    void getValue(){
        ClickCounter cc = new ClickCounter();
        cc.click();
        cc.click();
        assertEquals(2,cc.getClicks());
    }
}
