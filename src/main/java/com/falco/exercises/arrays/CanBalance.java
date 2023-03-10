package com.falco.exercises.arrays;

/**
 * return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum
 * of the numbers on the other side
 *
 * @author Giuseppe Falco
 *
 * Test provided
 */
public class CanBalance {

    private static int sumToEnd(int[] v, int start) {
        int sum = 0;
        for (int i = start; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static boolean canBalance(int[] v) {
        int sum = v[0];

        for (int i = 1; i < v.length; i++) {

            if (sum == sumToEnd(v, i)) {
                return true;
            }
            sum += v[i];
        }

        return false;
    }
}
