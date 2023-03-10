package com.falco.exercises.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String string){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < string.length() - 1; i++){
            String subString = string.substring(i + 1, string.length());
            String ch = string.substring(i,i+1);
            if(subString.contains(ch)){
                sb.append(ch);
            }
        }
        char [] duplicate = sb.toString().toCharArray();
        Arrays.sort(duplicate);
        return duplicate;
    }


}
