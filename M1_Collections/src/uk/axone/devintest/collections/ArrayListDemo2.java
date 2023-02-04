package uk.axone.devintest.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        //ArrayList<int> nums = new ArrayList<>();
        //primitive datatypes cannot be used within the Collection classes
        /*
            PRIMITIVE                   WRAPPER Class(java.lang)
            - int                       Integer
            - float                     Float
            - double                    Double
            - long                      Long
            - short                     Short
            - byte                      Byte
            - char                      Character
            - boolean                   Boolean
         */

        int i = 23;
        Integer num = i; //changing a primitive datatype to a reference datatype is called auto-boxing
        int x = num.intValue();//changing a reference datatype to a primitive datatype is called auto-unboxing

        boolean flag = false;
        Boolean fg = flag;
        boolean flg = fg.booleanValue();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(234);
        numbers.add(234344343);
        numbers.add(23412);

        for(int numb : numbers){
            System.out.println(numb);
        }

        //ArrayList is better for storing and accessing data
        //LinkedList is better for manipulating data

        List<Book> myBooks = new LinkedList<>();
        myBooks.add(new Book(123, "I love Java"));
        myBooks.add(new Book(345, "Selenium is cool"));
        myBooks.add(new Book (456,"Cucumber is cool"));

        for(Book bk : myBooks){
            System.out.println(bk.getBookID()+ "   "+bk.getBookName());
        }

    }
}
