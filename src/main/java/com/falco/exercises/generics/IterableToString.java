package com.falco.exercises.generics;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src){
        StringBuilder string = new StringBuilder();
        for(E e : src){
            string.append(e + ", ");
        }
        return string.toString();
    }
}
