package com.falco.exercises.strings;

public class GoodAroundTheBeginning {

    public static boolean goodAroundTheBeginning(String string){
        return string.startsWith("good") || string.startsWith(" good");
    }
}
