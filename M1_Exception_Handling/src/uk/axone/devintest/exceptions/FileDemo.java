package uk.axone.devintest.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

    //handling the exception using a try/catch block
    public void readFileHandle(){
        try {
            FileInputStream fis = new FileInputStream("readme.txt");
            fis.read();

        }
        catch (FileNotFoundException eFile) {
            System.out.println("Looks like the file you specified does not exist ...!!");
             eFile.printStackTrace();
            System.out.println(eFile.getMessage());
        }
        catch (IOException e) {
            System.out.println("Unable to read File ...!!");
            e.printStackTrace();
        }
    }

    //propagating the exception by adding the throws clause
    public void readFilePropagate() throws IOException, FileNotFoundException {
        FileInputStream fis = new FileInputStream("readme.txt");
        fis.read();
    }

}
