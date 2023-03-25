package com.falco.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

    public static List<String> reverse(List<String> sentence){
        List<String> reversed = new ArrayList<>(sentence);
        Collections.reverse(reversed);
        return reversed;
    }
}
