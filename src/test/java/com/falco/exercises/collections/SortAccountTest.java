package com.falco.exercises.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortAccountTest {

    SortAccount.Account p1;
    SortAccount.Account p2;

    @BeforeEach
    void setUp(){
        p1 = new SortAccount.Account(5.0, 1.0, LocalDateTime.of(2023,3,1,0,0));
        p2 = new SortAccount.Account(3.0, 2.0, LocalDateTime.of(2023,2,1,0,0));
    }

    @Test
    void sortByAmount() {
        List<SortAccount.Account> accounts = new ArrayList<>();
        accounts.add(p1);
        accounts.add(p2);
        SortAccount.sortByAmount(accounts);
        assertTrue(List.of(p2,p1).equals(accounts));
    }

    @Test
    void sortByInterestRate() {
        List<SortAccount.Account> accounts = new ArrayList<>();
        accounts.add(p1);
        accounts.add(p2);
        SortAccount.sortByInterestRate(accounts);
        assertTrue(List.of(p1,p2).equals(accounts));
    }

    @Test
    void sortByDuePayment() {
        List<SortAccount.Account> accounts = new ArrayList<>();
        accounts.add(p1);
        accounts.add(p2);
        SortAccount.sortByDuePayment(accounts);
        assertTrue(List.of(p2,p1).equals(accounts));
    }
}