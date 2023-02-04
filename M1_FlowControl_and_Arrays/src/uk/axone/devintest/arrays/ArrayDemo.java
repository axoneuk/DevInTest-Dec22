package uk.axone.devintest.arrays;

import java.io.File;

public class ArrayDemo {

    public static void main(String[] args) {

        //Initialise an array which can hold 5 Strings
        String[] testTools = new String[5];
        testTools[0] = "Selenium";
        testTools[1] = "Cucumber";
        testTools[2] = "JBehave";
        testTools[3] = "Appium";
        testTools[4] = "RestAssured";

        int arrSize = testTools.length;
        System.out.println(arrSize);

        for(int i=0; i < arrSize; i++){
            System.out.println(testTools[i]);
        }

        String[] progLangs = {"java","c++","Ruby","Python","Scala"};
        System.out.println(progLangs[3]);
        for(int i = 0; i < progLangs.length; i++){
            System.out.println(progLangs[i]);
        }

        int[] nums = {10,20,40, 500, 600, 8900, 902380934};
        System.out.println(nums[4]);

        boolean[] boolArr = {true, false, false, true};

        File[] myFiles = new File[30];

        Car[] myCars = new Car[10];
    }
}
