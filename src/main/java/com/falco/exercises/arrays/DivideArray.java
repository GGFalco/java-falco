package com.falco.exercises.arrays;

import java.util.Arrays;

public class DivideArray {

    public static double[] divideArray(double[] v, double factor) {

        double[] dst = new double[v.length];
        for(int i = 0; i < v.length; i++){
            dst[i] = v[i] / factor;
        }
        return dst;
    }

    public static void main(String[] args) {
        double[] v = {1, 1, 1};
        double[] dst = divideArray(v, 2);
        System.out.println(Arrays.toString(dst));
    }
}
