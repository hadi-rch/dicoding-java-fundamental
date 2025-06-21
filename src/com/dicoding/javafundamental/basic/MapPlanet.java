package com.dicoding.javafundamental.basic;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {

    public static void main(String[] args) {
        Map<String, Planet> planets = new HashMap();
        planets.put("Key-1", new Planet("mercury", 0.06));
        planets.put("Key-2", new Planet("venus", 0.82));
        planets.put("Key-3", new Planet("earth",1.00));
        planets.put("key-4", new Planet("mars", 0.11));
        planets.put("key-4", new Planet("mars-x", 0.11));

        System.out.println("map planets awal: " + planets.size());
        for(String key: planets.keySet()){
            System.out.println("\t" + key + " : " + planets.get(key));
        }

        planets.remove("Key-2");

        System.out.println("map planets akhir: " + planets.size());
        for(Planet planet : planets.values()){
            System.out.println("\t " + planet);
        }

    }
}
