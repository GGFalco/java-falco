package com.falco.exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;


class PhoneBookArrayTest {

    PhoneBookArray phoneBook;
    @BeforeEach
    void setUp(){
        Person [] p = {new Person("Falco","Giuseppe", "1"), new Person("Garagnani","Filippo","2")};
        phoneBook = new PhoneBookArray(p);
    }

    @Test
    void addPerson() {
        phoneBook.addPerson(new Person("Sidoli","Matteo","3"));
        assertEquals(new Person("Sidoli","Matteo","3"), phoneBook.searchByName("Matteo"));
    }

    @Test
    void removePerson() {
        Person [] check = new Person[]{new Person("Garagnani","Filippo","2")};
        phoneBook.removePerson(new Person("Falco","Giuseppe","1"));
        assertEquals(null,phoneBook.searchByName("Giuseppe"));

    }

    @Test
    void searchByLastname() {
        Person check = new Person("Falco","Giuseppe","1");
        assertEquals(check,phoneBook.searchByLastname("Falco"));

    }

    @Test
    void searchByName() {
        assertEquals(new Person("Falco","Giuseppe","1"), phoneBook.searchByName("Giuseppe"));

    }

    @Test
    void searchByNumber() {
        assertEquals(new Person("Garagnani", "Filippo","2"), phoneBook.searchByNumber("2"));
    }
}