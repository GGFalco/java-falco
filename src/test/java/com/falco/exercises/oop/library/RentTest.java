package com.falco.exercises.oop.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RentTest {
    Rent r1;
    Rent r2;
    @BeforeEach
    void setUp(){
        r1 = new Rent(
                LocalDate.of(2022, 3,1 ),
                LocalDate.of(2022,5,1),
                new Book("Libro1",2000,100),
                new Person("1","falco","giuseppe")
        );
         r2 = new Rent(
                LocalDate.of(2022, 3,1 ),
                LocalDate.of(2022,5,1),
                new Book("Libro1",2000,100),
                new Person("1","falco","giuseppe")
        );
    }

    @Test
    void isExpired() {
        assertFalse(r1.isExpired(LocalDate.of(2022, 6, 1)));
    }

    @Test
    void testEquals() {
        assertEquals(r1,r2);
    }
}