package com.falco.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list){
        List<Integer> noDuplicates = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){

            if(!list.subList(i +1, list.size()).contains(list.get(i))){
                noDuplicates.add(list.get(i));
            }
        }
        return noDuplicates;
    }
}
