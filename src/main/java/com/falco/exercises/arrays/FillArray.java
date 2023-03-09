package com.falco.exercises.arrays;


import java.util.Arrays;
import java.util.Random;

/**
 * Fill an array
 *
 * @author Giuseppe Falco
 */
public class FillArray {

    public static double[] fillArray2(int size, int value, boolean randomize){
        double[] v = new double[size];
        Arrays.fill(v, value);

        if(randomize){
            Random rnd = new Random();

            for(int i = 0; i < v.length; i++){
                v[i] += (rnd.nextDouble() - 0.5); // rnd.nextDouble una volta vale 0 e l'altra vale 1 quindi il range
                // [-0.5, 0.5] è compreso
            }
        }

        return v;
    }

    public static void main(String[] args) {
        double [] v = fillArray2(3,1,true);
        System.out.println(Arrays.toString(v));
    }

}
