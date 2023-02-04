package uk.axone.devintest.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Older versions of Java
        /*
        ArrayList herbs1 = new ArrayList<String>();
        ArrayList<String> herbs2 = new ArrayList<String>();
        */

        /*
        ArrayList
        - Maintains insertion order
        - Allows duplicates
        - Allows null
         */

        //since Java 1.7
        ArrayList<String> herbs = new ArrayList<>();
        herbs.add("Basil");
        herbs.add("Thyme");
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add(null);
        herbs.add(null);
        herbs.add("Coriander");

        herbs.remove(2);
        herbs.add(1, "Mint");
        herbs.set(0, "Bay Leaf");

        for(String herb : herbs){
            System.out.println(herb);
        }

        System.out.println("---------------------");

        for(int i=0; i < herbs.size() ; i++){
            System.out.println(herbs.get(i));
        }
    }
}