package com.falco.exercises.strings;

import java.util.Scanner;

public class CountYZ {
    public static int countYZ(String string) {
        int count = 0;
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].trim().endsWith("y") || strings[i].trim().endsWith("z")) {
                count++;
            }
        }

        return count;
    }
}
