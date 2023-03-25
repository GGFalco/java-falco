package com.falco.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {

    public static Set<Character> recurringChars(String string){

        Set<Character> duplicates = new HashSet<>();

        for(int i = 0; i < string.length(); i++){
            if( string.substring(i+1,string.length()).contains(string.substring(i,i+1))){
                duplicates.add(string.charAt(i));
            }
        }
        return duplicates;
    }

}
