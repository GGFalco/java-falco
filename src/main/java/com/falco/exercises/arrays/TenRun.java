package com.falco.exercises.arrays;

import java.util.Arrays;

public class TenRun {

    public static int[] tenRun(int[] v){
        int[] newV = new int[v.length];
        int j = 0;
        for(int i = j; j < v.length; i++){
            newV[i] = v[i];
            if((v[i] % 10) == 0){
                for(j = i; j < v.length; j++){
                    newV[j] = v[i];
                    if ((v[j] % 10) == 0 && v[j] != v[i]){
                        newV[j] = v[j];
                        i = j - 1;
                        break;
                    }
                }
            }
        }
        return newV;
    }

    public static int[] tenRun2(int[] v){
        int[] dst = new int[v.length];
        boolean foundFirst = false;
        int found = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 10 == 0) {
                foundFirst = true;
                found = v[i];
            }
            dst[i] = foundFirst ? found : v[i];
        }
        return dst;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tenRun(new int[]{2,10,2,3,20,2,1})));
        System.out.println(Arrays.toString(tenRun2(new int[]{2,10,2,3,20,2,1})));
    }
}
