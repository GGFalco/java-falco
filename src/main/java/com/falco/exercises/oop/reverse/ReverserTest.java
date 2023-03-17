package com.falco.exercises.oop.reverse;

/**
 * Implementazione anonima di un'interfaccia
 */
public class ReverserTest {

    public static void main(String[] args) {
        Reverser r = new Reverser() {
            @Override
            public String reverse(String string) {
                return new StringBuilder(string).reverse().toString();
            }
        };
        System.out.println(r.reverse("hello"));
    }
}
