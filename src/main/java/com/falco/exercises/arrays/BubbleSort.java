package com.falco.exercises.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v) {
        int end = v.length - 1;
        for (int i = 0; i < v.length; i++, end--) {
            for (int j = 0; j < end; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = temp;
                }
            }
        }
    }

    public static int[] bubbleSortCopy(int[] v) {
        int[] newV;
        bubbleSort(v);
        newV = Arrays.copyOf(v, v.length);
        return newV;
    }

    public static void main(String[] args) {
        int[] v = new int[]{3, 2, 1};
        System.out.println("Array: " + Arrays.toString(v));
        bubbleSort(v);
        int[] copiedV = bubbleSortCopy(new int[]{2, 3, 0});
        System.out.println("Sorted array: " + Arrays.toString(v));
        System.out.println("Copied array: " + Arrays.toString(copiedV) + " FROM: " + Arrays.toString(new int[]{2, 3,
                0}));
    }
}
