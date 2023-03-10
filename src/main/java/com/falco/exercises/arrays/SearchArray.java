package com.falco.exercises.arrays;

import java.util.Arrays;

public class SearchArray {
    // Tests all the elements of the array
    public static boolean containsBruteForce(String[] strings, String searched) {

        for (String string : strings) {
            if (searched.equals(string)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsBinary(String[] strings, String searched) {
        Arrays.sort(strings);
        return Arrays.binarySearch(strings, searched) >= 0; // per poter usare il binary search devi prima fare il sort
    }

    public static void main(String[] args) {
        System.out.println(containsBruteForce(new String[]{"car", "boat", "bike"}, "bike"));
        System.out.println(containsBinary(new String[]{"car", "boat", "bike"}, "bike"));
    }
}
