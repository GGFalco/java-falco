package com.falco.exercises.arrays;

import java.util.Arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        String[] string = new String[end - 1];

        for (int i = 0; start < end; start++, i++) {
            if ((start % 3 == 0) && (start % 5 == 0)) {
                string[i] = "FizzBuzz";
            } else if (start % 5 == 0) {
                string[i] = "Buzz";
            } else if (start % 3 == 0) {
                string[i] = "Fizz";
            } else {
                string[i] = Integer.toString(start);
            }
        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(1,8)));
    }
}
