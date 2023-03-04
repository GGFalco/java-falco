package com.falco.exercises.warmup;

import java.util.Random;
import java.util.Scanner;

/**
 * 2Players2Price, the closest guess WIN
 *
 * @author Giuseppe Falco
 * @see "https://github.com/GGFalco/java-falco"
 */
public class TheRightPrice {

    public static void main(String[] args) {
        Random rand = new Random();
        int price = rand.nextInt(0, 100);
        int p1;
        int p2;
        System.out.println("Hi players, try to guess the right price between 0 and 100. Who reach the closest guess, " + "win!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1, it's your turn:\n");
        p1 = sc.nextInt();
        System.out.println("Player 2, it's your turn:\n");
        p2 = sc.nextInt();

        if ((price - p1) > (price - p2)) {
            System.out.println("Congratulations Player 2, you win!");
        } else {
            System.out.printf("Congratulations Player 1, you win! The price was %d.", price);
        }
    }
}
