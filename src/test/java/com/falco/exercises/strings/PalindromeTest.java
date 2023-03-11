package com.falco.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertEquals(true, Palindrome.isPalindrome("radar"));
        assertEquals(false, Palindrome.isPalindrome("whistleblower"));
        assertEquals(true, Palindrome.isPalindrome("r"));
        assertEquals(true, Palindrome.isPalindrome(""));
    }
}