package com.falco.exercises.oop.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1;
    Person p2;

    @BeforeEach
    void setUp(){
        p1 = new Person("1","falco","giuseppe");
        p2 = new Person("1","falco","giuseppe");
    }

    @Test
    void testEquals() {
        assertEquals(p1,p2);
    }
}