package com.falco.exercises.strings;

import java.util.Arrays;

public class RemoveFirstLast {
    public static String removeFirstLast(String string){
        String s = new String();
        if (string.length() == 0){
            return s;
        }
        if(string.length() == 1){
            s = string;
            return s;
        }
        if(string.charAt(0) == string.charAt(string.length()-1)){
            s = string.substring(1,string.length()- 1);
        }
        return s;
    }
}
