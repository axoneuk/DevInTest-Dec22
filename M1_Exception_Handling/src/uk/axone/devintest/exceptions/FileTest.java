package uk.axone.devintest.exceptions;

import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {
        FileDemo fDemo = new FileDemo();

        fDemo.readFileHandle();

        fDemo.readFilePropagate();
    }
}
