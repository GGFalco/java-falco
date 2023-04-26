package com.falco.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class SquareFive {
    public static long squareFive(List<Integer> nums){
        return nums.stream()
                .map(number -> (number * number) + 10)
                .filter(number -> !number.toString().endsWith("5"))
                .count();
    }
}
