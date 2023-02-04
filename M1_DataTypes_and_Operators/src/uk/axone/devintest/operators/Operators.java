package uk.axone.devintest.operators;

public class Operators {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        //Arithmetic Operators
        int z = x + y;//Addition
        int a = x - y;//Subtraction
        int b = x * y;//Multiplication
        int c = x / y;//Division
        int d = x % y;//Modulus operator 3 % 2 = 1; 15 % 3 = 0; 7 % 5 = 2

        //Assignment Operators
        int k = 4;
        int m = 3;

        k += m;// k = k + m
        k -= m; //k = k - m
        k *= m; //k = k * m
        k /= m; //k = k / m

        //Increment Operators
        x = 10;
        y = 20;

        System.out.println(x++);// x = x + 1; - post increment - value is incremented but only available in the next statement
        System.out.println(x);

        System.out.println(++y);// y = y + 1 - pre increment - value is incremented and available in the same statement
        System.out.println(y);

        x--; //x = x - 1 - post decrement
        --y; // y = y - 1 - pre decrement

        //Comparison Operators
        x = 10;
        y = 20;

        boolean result = x < y;
        System.out.println(result);

        boolean result1 = x > y;
        System.out.println(result1);

        System.out.println(x >= y);
        System.out.println(x <= y);

        boolean result2 =  (x == y);//comparing x and y for equality - only use with primitive datatypes  - NOT Reference datatypes
        boolean result3 = (x != y);//comparing x and y for inequality - only use with primitive datatypes  - NOT Reference datatypes

    }
}
