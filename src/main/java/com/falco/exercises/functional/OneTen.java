package com.falco.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class OneTen {
    public static List<Integer> oneTen(List<Integer> nums){
        return nums.stream()
                .map(number -> (number + 1) * 10)
                .collect(Collectors.toList());

        /**
         * nums.replaceAll(number -> (number + 1) * 10);
         * return nums;
         */
    }
}
