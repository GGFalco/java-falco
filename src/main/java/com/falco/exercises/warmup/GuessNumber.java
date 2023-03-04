package com.falco.exercises.warmup;

import java.util.Random;
import java.util.Scanner;

/**
 * Guessing Number Quiz Game
 *
 * @author Giuseppe Falco
 */

public class GuessNumber {
    public static void main(String[] args) {
        boolean a = true;

        while (a) {
            Random rand = new Random();
            int factor = rand.nextInt(0,3);
            int number = rand.nextInt(0, factor);
            System.out.printf("I'm thinking of number between 0 and %d, try to guess:\n", factor);

            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("You Guess!");
                a = false;
            } else {
                System.out.println("You're Wrong! Try Again!");
            }
        }
    }
}
