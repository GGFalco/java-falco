package com.falco.exercises.arrays;

import java.util.Arrays;

public class Splitter {

    public static int[] splitter(int input) {
        int[] vector;
        int number = input;
        int size = 0;
        while (input > 0) {
            input /= 10;
            size++;
        }
        vector = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            vector[i] = number % 10;
            number /= 10;
        }
        return vector;
    }

    public static int[] splitter2(int input) {
        String numberString = Integer.toString(input);
        int[] vector = new int[numberString.length()];
        for(int i = 0; i < numberString.length(); i++) {
            vector[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return vector;
    }

    public static void main(String[] args) {
        int[] v = splitter(321);
        int[] v2 = splitter2(432);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(v2));
    }
}
