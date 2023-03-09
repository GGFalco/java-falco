package com.falco.exercises.arrays;

import java.util.Arrays;

public class MoveZeroEnd {

    public static int[] moveZerosEnd(int[] v){
        int[] dst = new int[v.length];
        Arrays.fill(dst,0);
        for(int i = 0, j = 0; i < v.length; i++){
            if(v[i] != 0){
                dst[j] = v[i];
                j++;
            }
        }
        return dst;
    }

    public static void main(String[] args) {
        int[] v = moveZerosEnd(new int[]{9,0,0,4});
        System.out.println(Arrays.toString(v));
    }
}
