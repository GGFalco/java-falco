package com.falco.exercises.strings;

public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIf(String string){
        StringBuilder sb = new StringBuilder();

        if(string.length() >= 1) {
            if (string.charAt(0) == 'H') {
                sb.append('H');
            }
        }
        if(string.length() >= 2) {
            if (string.charAt(1) == 'e') {
                sb.append('e');
            }
        }

        for(int i = 2; i < string.length(); i++){
                sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        removeFirstTwoCharsIf("Y");
    }
}
