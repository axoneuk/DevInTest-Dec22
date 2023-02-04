package uk.axone.devintest.datatypes;

import java.io.File;

public class DataTypes {

    //Primitive Datatypes

    //Numeric - Integers
    byte myByte = 127;
    short myShort = 32767;
    int i = 78387843;
    long myLong = 37897723297L;

    //Numeric - floating point
    float myFloat = 10.237928F;//32 bit number - 7 decimal places
    double myDouble = 678.2378897239;//64 bit number - 16 decimal places

    char myChar = '$';

    boolean bool1 = true;
    boolean bool2 = false;

    //Reference Datatypes
    //All classes from the java API library
    File myFile = new File("readme.txt");
    String str = new String("Axone");

    Employee ram = new Employee();
    DataTypes dt = new DataTypes();

}
