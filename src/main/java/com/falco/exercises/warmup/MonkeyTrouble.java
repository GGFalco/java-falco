package com.falco.exercises.warmup;


import java.util.Scanner;

/**
 * We're in trouble if the two monkeys are both smiling or if neither of them is smiling
 *
 * @author Giuseppe Falco
 * @see "https://github.com/GGFalco/java-falco"
 */
public class MonkeyTrouble {

    public static void main(String[] args) {
        boolean aSmile;
        boolean bSmile;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Dear, there are two monkeys: A & B\nIs the monkey A smiling? (Yes/No)\n");

        String answer = sc.next();

        aSmile = answer.toLowerCase().contains("yes");

        System.out.println("Now, is the B monkey smiling? (Yes/No)");
        answer = sc.next();

        bSmile = answer.toLowerCase().contains("yes");

        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            System.out.println("We're in trouble! RUN");
        } else {
            System.out.println("We're safe!");
        }
    }
}
