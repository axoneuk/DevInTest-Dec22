package uk.axone.devintest.garbagecollection;

public class CupTest {

    public static void main(String[] args) {

        Cup c1 = new Cup("Red");
        Cup c2 = new Cup("Green");
        Cup c3 = new Cup("Blue");

        c1 = c2;
        c2 = c3;
        c3 = c1;

        System.out.println(c3.getColour());

        Cup c4 = new Cup("yellow");
        c4 = null;

        System.out.println(new Cup("Black").getColour());

        System.gc();

    }
}
