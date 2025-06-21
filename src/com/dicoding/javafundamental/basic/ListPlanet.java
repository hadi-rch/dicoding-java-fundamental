package com.dicoding.javafundamental.basic;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {

        //deklasrasi array
        String[] heroes = new String[2];
        heroes[0] = "Mercury";
        heroes[1] = "Venus";

        //menggunakan array list
        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("vennus");
        planets.add("vennus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planet awal: ");
        for(int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+i+" = " + planets.get(i));
        }

        planets.remove("vennus");

        System.out.println("List planet akhir: ");
        for(int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+i+" = " + planets.get(i));
        }

    }
}
