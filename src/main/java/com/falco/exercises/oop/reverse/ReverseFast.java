package com.falco.exercises.oop.reverse;

public class ReverseFast implements Reverser {

    String reverseFast;

    public ReverseFast(String string) {
        this.reverseFast = string;
    }

    @Override
    public String reverse(String string) {
        StringBuilder reversed = new StringBuilder(string);
        return reversed.reverse().toString();
    }
}
