package com.falco.exercises.arrays;

import java.util.Arrays;

public class Fibonacci {

    public static long[] fibonacci(int n) {
        long[] vector;
        if (n == 1) {
            vector = new long[]{0};
        } else if (n == 2) {
            vector = new long[]{0,1};
        } else {
            vector = new long[n];
            vector[0] = 0;
            vector[1] = 1;
            for (int i = 2; i < n; i++) {
                vector[i] = vector[i - 1] + vector[i - 2];
            }
        }
        return vector;
    }
}
