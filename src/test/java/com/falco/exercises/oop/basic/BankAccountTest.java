package com.falco.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount ba;
    @BeforeEach
    void setUp(){
        ba = new BankAccount(10);
    }
    @Test
    void getBalance() {
        assertEquals(10,ba.getBalance());
    }

    @Test
    void deposit() {
        ba.deposit(10);
        assertEquals(20, ba.getBalance());
    }

    @Test
    void withdraw() {
        ba.withdraw(5);
        assertEquals(5, ba.getBalance());
    }
}