package com.falco.exercises.collections;

import java.util.*;

public class Eratosthenes {

    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> series = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            series.add(i);
        }

        for (Iterator<Integer> i = series.iterator(); i.hasNext(); ) {
            int element = i.next();
            if ((double) element >= Math.sqrt(n)) {
                break;
            }
            if (element != 2 && element % 2 == 0) {
                i.remove();
                continue;
            }
            if (element != 3 && element % 3 == 0) {
                i.remove();
                continue;
            }
        }

        return series;
    }
}
