package uk.axone.devintest.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        /* HashSet
         - does not maintain insertion order
         - does not retain duplicates
         - allows null
         */

        Set<String> countries = new HashSet<>();
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("France");
        countries.add("Spain");
        countries.add("India");
        countries.add(null);
        countries.add("Germany");
        countries.add("Germany");
        countries.add("Germany");

        for(String country : countries){
            System.out.println(country);
        }

    }
}
