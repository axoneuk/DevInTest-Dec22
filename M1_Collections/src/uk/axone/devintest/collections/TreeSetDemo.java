package uk.axone.devintest.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        /*
        TreeSet
        - Does not allow null
        - Duplicates not stored
        - data is ordered
        - the datatype used MUST implement the Comparable Interface
         */

        Set<String> countries = new TreeSet<>();
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("Chile");
        countries.add("France");
        countries.add("Spain");
        countries.add("India");
        //countries.add(null);
        countries.add("Brazil");
        countries.add("Germany");
        countries.add("Argentina");

        for(String country : countries){
            System.out.println(country);
        }

        System.out.println("------------------------------");

        Set<Book> myBooks = new TreeSet<>();
        myBooks.add(new Book(123, "B - I love Java"));
        myBooks.add(new Book(345, "C - Selenium is cool"));
        myBooks.add(new Book (456,"A - Cucumber is cool"));

        for(Book bk : myBooks){
            System.out.println(bk.getBookID()+ "   "+bk.getBookName());
        }

    }

}
