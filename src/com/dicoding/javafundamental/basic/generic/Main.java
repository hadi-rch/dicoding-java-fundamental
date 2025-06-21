package com.dicoding.javafundamental.basic.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList();
        lo.add("lo - string 1");
        lo.add(new Planet("Mercury", 0.6));

        for (Object o : lo){
            Planet p = (Planet) o;
            p.print();
        }

        List<Planet> lp = new ArrayList();
        lp.add(new Planet("Mercury", 0.6));
        lp.add(new Planet("venus", 0.82));

        for(Planet p : lp){
            p.print();
        }

    }
}
