package com.falco.exercises.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int[][] copied = new int[original.length][];
        for(int i = 0; i < original.length; i++){
            copied[i] = Arrays.copyOf(original[i], original[i].length);
            //System.arraycopy(original[i],0,copied[i],0,original[i].length); Doesn't work
        }
        return copied;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deepCopy(new int[][]{new int[]{1,2}, new int[]{3}})));
    }
}
