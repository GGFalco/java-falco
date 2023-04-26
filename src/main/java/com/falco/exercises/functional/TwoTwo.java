package com.falco.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums){
        return nums.stream()
                .map(number -> number * 2)
                .filter(number -> !number.toString().endsWith("2"))
                .collect(Collectors.toList());
    }
}
