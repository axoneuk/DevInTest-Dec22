package uk.axone.devintest.strings;

public class StringDemo {

    public static void main(String[] args) {

        String str = new String();
        String str1 = new String("Axone");
        char[] chrArr = {'A','X','O','N','E'};
        String str2 = new String(chrArr);

        //String Literal
        String strl = "AXONE";
        strl = strl.concat(" TECHNOLOGIES");
        strl = strl.concat(" UK LIMITED");

        //String is immutable
        System.out.println(strl);

        System.out.println("-----------------------------------");

        StringBuilder sBuff = new StringBuilder("AXONE");
        sBuff.append(" TECHNOLOGIES");
        sBuff.append(" UK LTD");

        String strx = sBuff.toString();

        System.out.println(sBuff);

    }

}
