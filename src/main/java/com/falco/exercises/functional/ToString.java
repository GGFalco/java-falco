package com.falco.exercises.functional;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToString {

    public static <T> String toString(Stream<T> stream, int n){
        return stream.limit(n).map(e -> e.toString()).collect(Collectors.joining(","));
    }
}
