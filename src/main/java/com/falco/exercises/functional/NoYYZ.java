package com.falco.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {
    public static List<String> noYYZ(List<String> strings){
        return strings.stream()
                .map(string -> string + "y")
                .peek(e -> {
                    if(e.startsWith("z")){
                        System.out.println(e);
                    }
                })
                .filter(string -> !string.contains("yy"))
                .collect(Collectors.toList());
    }

}
