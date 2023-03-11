package com.falco.exercises.strings;

import com.falco.exercises.arrays.CanBalance;

public class SumDigits {

    public static int sumDigits(String string){
        int sum = 0;
        if(string.isEmpty()){
            return sum;
        }
        for(int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                sum += Character.digit(string.charAt(i), 10);
            }
        }
        return sum;
    }
}
