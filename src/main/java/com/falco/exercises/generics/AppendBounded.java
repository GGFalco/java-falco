package com.falco.exercises.generics;

import java.util.List;
import java.util.Objects;

public class AppendBounded {

    public static <T extends U,U> void append(List<U> dst, List<T> src){
        for(T t: src){
            dst.add(t);
        }
    }
}
