package com.falco.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder stringRet = new StringBuilder();
        for(String string : strings){
            stringRet.append(string);
        }
        String s = stringRet.toString();
        return s;
    }
}
