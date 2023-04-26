package com.falco.exercises.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {

    public static <T> void justPrintList(List<T> list){
        list.forEach(a -> System.out.println("Hello " + a + "!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach( (a,b) -> System.out.println("K: " + a.toString() + ", V: " + b.toString()));
    }
}
