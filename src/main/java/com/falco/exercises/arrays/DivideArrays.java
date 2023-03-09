package com.falco.exercises.arrays;

import java.util.Arrays;

public class DivideArrays {

    public static double[] divideArrays(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            return null;
        }

        double[] dst = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            dst[i] = v1[i] / v2[i];
        }
        return dst;
    }

    public static void main(String[] args) {
        double [] v1 = {2,10,1};
        double [] v2 = {2,5,2};
        double[] dst = divideArrays(v1,v2  );
        System.out.println(Arrays.toString(dst));
    }
}
