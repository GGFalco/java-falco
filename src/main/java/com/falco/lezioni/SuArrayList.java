package com.falco.lezioni;

import com.falco.exercises.oop.phonebook.Person;

import java.util.*;

public class SuArrayList {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        l.add("nicola");
        l.add("nicoletta");
        l.add(0, "giulia");


        // Ricorda di ridefinire l'equals dentro <Class> perchè contains funzioni bene
        System.out.println(l.contains("silvana")); // false
        List<Person> l2 = new ArrayList<>();
        l2.add(new Person("falco","giuseppe","1"));
        // true perchè ho ridefinito l'equals dentro <Person>
        System.out.println(l2.contains(new Person("falco","giuseppe","1")));


        // Collections è implementato da Set Queue e List quindi contiene alcuni metodi di ArrayList quindi posso
        // usare questi metodi
        Collections.sort(l);
        Collections.binarySearch(l,"giovanni");
        // List.of crea al volo una lista, mentre addAll inserisce un pacchetto di cose
        l.addAll(List.of("giuseppe","filippo" ));
        // elimino la lista
        // l = new ArrayList<>();
        // meglio usare il metodo
        // l.clear();
        l.trimToSize(); // METODO di ArrayList


        // HashSet NON preserva l'ordine di inserimento
        Set<String> l3 = new HashSet<>();
        l3.add("giuseppe");
        l3.add("aiuseppe");
        l3.add("bombolone");
        System.out.println(l3);

        // LinkedHashSet PRESERVA l'ordine di inserimento
        Set<String> l4 = new LinkedHashSet<>();
        l4.add("giuseppe");
        l4.add("ciccio");
        l4.add("pluto");
        System.out.println(l4);

        // TreeSet ORDINA automaticamente l'inserimento
        Set<String> l5 = new TreeSet<>();
        l4.add("giuseppe");
        l4.add("ciccio");
        l4.add("pluto");
        l4.add("abaco");
        System.out.println(l5);

        // ITERATORI

        List<Double> I = new LinkedList<>(List.of(1.0,2.0,3.0));
        int count = 0;
        // SOLO RIMUOVERE
        for(Iterator<Double> i = I.iterator(); i.hasNext();){
            double d = i.next();
            if(count==1){
                i.remove();
            }
            count++;
        }

        // Se si vuole AGGIUNGERE e rimuovere elementi
        List<Double> F = new LinkedList<>(List.of(1.0,2.0,3.0));
        count = 0;
        for(ListIterator<Double> i = F.listIterator(); i.hasNext();){
            double d = i.next();
            if(count == 1){
                i.remove();
            }
            if(count == 2){
                i.add(22.3);
            }
            count++;
        }



    }
}
