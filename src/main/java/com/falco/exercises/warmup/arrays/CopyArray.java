package com.falco.exercises.warmup.arrays;

/**
 * Accepting a double[] and returning a copy of the double[]
 */
public class CopyArray {

    public static double[] copyArray(double[] src){
        double [] dst = new double[src.length];
        System.arraycopy(src, 0,dst,0,src.length);
        return dst;
    }
}
