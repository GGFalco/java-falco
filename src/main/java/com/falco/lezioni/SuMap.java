package com.falco.lezioni;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SuMap  {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"giuseppe");
        map.put(1,"matteo");
        map.put(3,"filippo");
        map.put(8,"nicola");
        map.put(5,"jack");

        // prima colonna sono le chiavi
        System.out.println(map.keySet());

        // Stampiamo la mappa
        Set<Map.Entry<Integer,String>> l = map.entrySet(); // entrySet è la coppia di valori
        for(Map.Entry<Integer, String> entry : l){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Stampa di default
        System.out.println(map);
        // ritorna il valore associato alla chiave 4
        System.out.println(map.get(4));


    }
}
