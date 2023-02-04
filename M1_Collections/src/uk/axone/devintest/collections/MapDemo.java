package uk.axone.devintest.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        /*
        HashMap
        - Insertion order is not maintained
        - Duplicate keys are not stored
         */

        /*
        TreeMap
        - Duplicates are not allowed
        - Entries are ordered based on the Key
        - The datatype used for the Key must implement the Comparable Interface
         */

        Map<String, String> appConfig = new TreeMap<>();
        appConfig.put("URL","www.axone.uk");
        appConfig.put("Username", "Admin");
        appConfig.put("Password","Password123");
        appConfig.put("Password","Password123");
        appConfig.put("IPAddress","192.168.1.1");
        appConfig.put("IPAddress","192.168.1.1");
        appConfig.put("IPAddress1","192.168.1.1");


        String value = appConfig.get("Username");
        System.out.println(value);

        System.out.println("---------------------");

        for(Map.Entry<String, String> configItem : appConfig.entrySet()){
            System.out.println(configItem.getKey() +  "   "+ configItem.getValue());
        }

        System.out.println("---------------------");

        Map<String, Book> bookAllocation = new TreeMap<>();
        bookAllocation.put("Ram", new Book(123,"Java for Testers"));
        bookAllocation.put("Karthik", new Book(678,"The Object Primer"));
        bookAllocation.put("Puneet", new Book(456,"Cucumber is cool"));

        Book b1 = bookAllocation.get("Karthik");
        System.out.println(b1.getBookName());

    }

}
