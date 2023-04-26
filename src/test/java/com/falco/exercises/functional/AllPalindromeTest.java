package com.falco.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPalindromeTest {

    @Test
    void allPalindrome() {
        System.out.println(AllPalindrome.allPalindrome(List.of("kayak", "deed", "noon")));
        System.out.println(AllPalindrome.allPalindrome(List.of("kayak", "deed", "hello")));
        System.out.println(AllPalindrome.allPalindrome(List.of("world", "hello")));
    }
}