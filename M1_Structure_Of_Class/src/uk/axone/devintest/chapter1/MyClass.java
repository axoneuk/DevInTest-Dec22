package uk.axone.devintest.chapter1;

import java.io.File;
import java.util.Date;

/**
 * This is a javadoc comment
 * Author ; Ram
 * Date : 04 Dec 2022
 */

public class MyClass {

    int x = 10;
    //int : DataType, x : variable name, 10 : initial value
    int y = 20; //this statement is initialising a variable of the type int with an initial value of 20
    String str = "Axone";
    String str1;
    StringBuffer str3;
    Number num1;

    File readMe;
    Date today;

    /*
    This is a block comment
    All text between is commented
    ---
    --
     */

    //Constructor
    //No return type
    //name matches the class name
    //Not Mandatory

    MyClass(){
        System.out.println("Inside the constructor");
    }

    void addNumbers(){
        int sum = x + y;
        System.out.println(sum);
    }

    int multiplyNumbers(int a, int b){
        int product = a * b;
        return product;
    }

    File getFile(){
        return readMe;
    }

    void main(){

    }

    //THE main method
    public static void main(String[] strArr) {
        System.out.println("Beginning execution....");
        MyClass mc = new MyClass();//initialising my class
        mc.addNumbers();
        int prod = mc.multiplyNumbers(20,30);
        System.out.println(prod);
    }

}
