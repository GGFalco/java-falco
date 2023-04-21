package com.falco.exercises.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountOccurrences {

    public static <T> int countOccurrences(T[] src, T item){

        int count = 0;
        for(T t : src){
            if(item == null && t == null ){
                count++;
                continue;
            }
            if(item == null && t != null){
                continue;
            }
            if(t.equals(item)){
                count++;
            }
        }
        return count;
    }
}
