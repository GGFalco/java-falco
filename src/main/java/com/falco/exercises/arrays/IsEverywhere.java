package com.falco.exercises.arrays;

public class IsEverywhere {

    public static boolean isEverywhere(int[] v, int value){
       String s = Integer.toString(value);
        for(int i = 0; i < v.length - 1; i++){
            if (v[i] != value && v[i + 1] != value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isEverywhere(new int[]{1,2,1,3},1));
    }
}
