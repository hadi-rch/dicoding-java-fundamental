package com.dicoding.javafundamental.basic;

import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("merkurius");
        planets.add("venus");
        planets.add("bumi");
        planets.add("bumi");
        planets.add("bumi");
        planets.add("mars");

        System.out.println("Set planet awal: (Size = " + planets.size() + ")");
        for(String planet : planets){
            System.out.println("\t " + planet);
        }

        planets.remove("venus");
        System.out.println("Set planet akhir: (Size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println("\t " + iterator.next());
        }
    }
}
