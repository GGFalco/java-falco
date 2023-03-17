package com.falco.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    Letter letter;

    @BeforeEach
    void setUp(){
        letter = new Letter("Giuseppe","Filippo", new StringBuilder("Hello"));
    }


    @Test
    void addLine() {
        letter.addLine("dear");
        assertEquals("Hello dear", letter.getText());
    }

    @Test
    void getText() {
        assertEquals("Hello", letter.getText());
    }
}