package com.falco.exercises.collections;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAccount {

    public static class Account{
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }
    }

    public static void sortByAmount(List<Account> accounts){
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return (int) ((int) o1.amount - o2.amount);
            }
        });
    }

    public static void sortByInterestRate(List<Account> accounts){
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return (int) (o1.interestRate - o2.interestRate);
            }
        });
    }

    public static void sortByDuePayment(List<Account> accounts){
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.duePayment.compareTo(o2.duePayment);
            }
        });
    }
}
