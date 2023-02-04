package uk.axone.devintest.objects;

import java.io.File;

public class Variables {

    /*
    Global Variables - Declared outside of methods and constructors
                     - They can be used throughout the class

                     1) Instance variables : non-static
                     2) Class variables : static
                     Note that static variables must always be global
     */

    //Instance variables
    String str;
    HumanBeing ram;
    Employee karthik;
    int i = 0;
    File f1;

    //class variables
    static String str1;
    static HumanBeing tom;
    static int x;

    /*
        Local variables - scope is limited to the method or the constructor
                1) variables declared inside method or a constructor
                2) arguments passed to a method or a constructor
     */

    int doSomething(int numtimes){//numTimes - method argument - local
        karthik = new Employee();
        i = 11;
        int j = 32;//local variable
        String strLocal = "Axone";//local variable
        x = 25;
        return j;
    }

    void doSomethingElse(){
        i = 30;
        //numTimes = 23;
        //j = 45;
        //strLocal = "Dev In Test";
        str = "Dev In test";
    }

    static void doSomethingStatic(){
        //instance variables cannot be used in static methods
        //str = "Internship";
        str1 = "DEvOps";
    }

}
