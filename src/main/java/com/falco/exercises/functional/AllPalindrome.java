package com.falco.exercises.functional;

import java.util.List;

public class AllPalindrome {

    public static boolean allPalindrome(List<String> strings){
        return strings.stream()
                .allMatch(string -> new StringBuilder(string).reverse().toString().equals(string));
    }
}
