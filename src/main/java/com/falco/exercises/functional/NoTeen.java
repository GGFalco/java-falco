package com.falco.exercises.functional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums){
        return nums.stream()
                .filter(number -> number > 19 || number < 13)
                .collect(Collectors.toList());
    }
}
