package com.falco.exercises.strings;

public class EqualIsNot {

    public static boolean equalIsNot(String string) {

        if(string.isEmpty()){
            return true;
        }

        String subString = string;

        int numberOfIs = 0;
        int numberOfNot = 0;
        int i = 0;

        while (true) {
            i = subString.indexOf("is");
            if (i < 0) {
                break;
            }
            subString = subString.substring(i + "is".length(), subString.length());
            numberOfIs++;
        }

        i = 0;
        while (true) {
            i = string.indexOf("not", i);
            if (i < 0) {
                break;
            }
            i += "not".length();
            numberOfNot++;
        }

        return numberOfNot == numberOfIs;
    }

}
