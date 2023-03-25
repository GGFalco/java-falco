package com.falco.exercises.collections;

import java.util.*;

/**
 * Fatto male
 */
public class Intersection {

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> elements = new HashSet<>();

        for (int i : first) {
            if (second.contains(i)) {
                elements.add(i);
            }
        }

        return elements;
    }
}
