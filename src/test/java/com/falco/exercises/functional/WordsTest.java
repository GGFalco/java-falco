package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void howManyLines() {
        try {
            System.out.println(Words.howManyLines("src/main/resources/words", "a"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void howManyTimes() {
        try {
            System.out.println(Words.howManyTimes("src/main/resources/words", "a"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}