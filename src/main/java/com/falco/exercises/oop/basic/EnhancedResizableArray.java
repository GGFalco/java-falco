package com.falco.exercises.oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {

    public static final int DEFAULT_CAPACITY = 4;
    int[] v;
    int size;

    /**
     * Create an empty array with size 0, but allocated by DEFAULT_CAPACITY
     */
    public EnhancedResizableArray() {
        this.v = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(int value) {
        // se size > DEFAULT_CAPACITY = v.length
        if (size >= v.length) {
            // creo un vettore temporanea la cui grandezza è DEFAULT_CAPACITY *2
            int[] tmp = new int[v.length * 2];
            // faccio una copia del vettore v in tmp
            System.arraycopy(v, 0, tmp, 0, v.length);
            // dico che v è uguale a tmp
            v = tmp;
        }
        // size è la lunghezza che incremento dopo aver aggiunto un elemento alla fine (indice size)
        set(size++, value);
    }

    // per me qua c'è un errore
    public void remove(int index) {
        // prendo index + 1 e lo sovrascrivo a partire da index fino alla fine
        System.arraycopy(v, index + 1, v, index, v.length - index - 1);
        size--;
    }

    public int get(int index) {
        return v[index];
    }

    public void set(int index, int value) {
        if (index < size)
            v[index] = value;
    }

    public boolean contains(int value) {
        return Arrays.binarySearch(v, value) > 0;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        return Arrays.copyOf(v, size);
    }
}
