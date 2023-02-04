package uk.axone.devintest.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("---- START -----");
        String str = null;
        try{
            int x = 10;
            int y = 2;

            int z = x / y;

            String[] strArr = new String[5];
            String str1 = strArr[3];

            str.getBytes();

        }
        catch(ArithmeticException ex){
            System.out.println("Some issue with the division operation ...");
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException arrEx){
            System.out.println("Some issue accessing the array ...");
            arrEx.printStackTrace();
            System.out.println(arrEx.getMessage());
        }
        catch(Exception ex){
            System.out.println("Something else went wrong....");
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Inside finally");
        }


        System.out.println("------ END ------");

    }

}
