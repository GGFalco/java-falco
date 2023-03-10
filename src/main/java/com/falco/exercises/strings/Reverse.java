package com.falco.exercises.strings;

public class Reverse {
    public static String reverse(String string) {
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        String reverse = reversed.toString();
        return reverse;
    }
}
