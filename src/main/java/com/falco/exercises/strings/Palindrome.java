package com.falco.exercises.strings;

public class Palindrome {

    public static boolean isPalindrome(String string) {
        if(string.isEmpty()){
            return true;
        }
        /*
         String reversedString = new StringBuilder(string).reverse().toString();
         reversedString.equalsIgnoreCase(string);
        */
        boolean palindrome = true;
        int j = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(j - i)) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
