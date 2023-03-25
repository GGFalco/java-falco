package com.falco.exercises.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DownSize {

    public static void downSize(List<String> list, int n) {
        int count = 1;
        for (ListIterator<String> i = list.listIterator(); i.hasNext(); ) {
            String str = i.next();
            if (count % n == 0) {
                i.remove();
            }
            count++;
        }
    }
}
