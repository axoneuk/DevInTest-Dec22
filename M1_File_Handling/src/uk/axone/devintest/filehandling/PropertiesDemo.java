package uk.axone.devintest.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("M1_File_Handling/application.properties");
        Properties props = new Properties();
        props.load(fis);
        String value = props.getProperty("count");
        System.out.println(value);
        int count = Integer.parseInt(value);
        System.out.println(count);

    }

}
