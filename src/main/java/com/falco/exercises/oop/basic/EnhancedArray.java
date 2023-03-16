package com.falco.exercises.oop.basic;

import java.util.Arrays;
import java.util.Random;

public class EnhancedArray {

    int [] array;

    public EnhancedArray(int capacity) {
        array = new int[capacity];
    }

    public int size(){
        return array.length;
    }

    public int get(int index){
        return array[index];
    }

    public void set(int index, int value){
        array[index] = value;
    }

    public boolean contains(int value){
        return Arrays.binarySearch(array,value) > 0;
    }

    public void resetZero(){
        Arrays.fill(array,0);
    }

    public void resetRandom(){
        Random rnd = new Random();
        Arrays.fill(array, rnd.nextInt(0, array.length));
    }

    public int[] toArray(){
        int[] copied;
        copied = Arrays.copyOf(array,array.length);
        return copied;
    }
}
