package com.falco.exercises.oop.reverse;

public class ReverseSlow implements Reverser {
    String reverseSlow;

    public ReverseSlow(String reverseSlow) {
        this.reverseSlow = reverseSlow;
    }

    @Override
    public String reverse(String string) {
        char[] toReverse = string.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            reversed.append(String.valueOf(toReverse[i]));
        }

        return reversed.reverse().toString();
    }
}
