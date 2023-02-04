package uk.axone.devintest.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGMultipleTests {

    @Test
    public void test1(){
        startTest();
        System.out.println("running test 1");
    }

    @Test
    public void test2(){
        startTest();
        System.out.println("running test 2");
    }

    //@Test(enabled = false)
    @Ignore
    public void test3(){
        startTest();
        System.out.println("running test 3");
    }

   @Test
    public void test4(){
       startTest();
        System.out.println("running test 4");
    }

    private void startTest(){
        System.out.println("starting test");
    }

}
