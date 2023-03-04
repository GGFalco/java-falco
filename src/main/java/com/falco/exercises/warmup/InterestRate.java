package com.falco.exercises.warmup;


/**
 * Calculate the balance of an account
 *
 * @author Giuseppe Falco
 * @see "https://github.com/GGFalco/java-falco"
 */
public class InterestRate {

    public static void main(String[] args) {
        int balance = 1000;
        int mountant = balance;
        int rate = 5;

        for(int i = 0; i < 3; i++){
            int temp = mountant;
            temp = (temp * rate)/100;
            mountant += temp;
        }

        System.out.printf("Current balance: %d\nRate: %d%%\nAfter 3 Years: %d", balance, rate, mountant);
    }
}
