package uk.axone.devintest.testng;

import org.testng.annotations.*;

public class TestNGAnnotations {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite - Making a connection to the MQ and inject some test data");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("--BeforeTest - Opening a connection to the DB");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("----BEforeClass - Launching Chrome Browser");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("------Before Method - Logging into the application");
    }

    @Test
    public void testFunction1(){
        System.out.println("Browsing items");
    }

    @Test
    public void testFunction2(){
        System.out.println("Add items to Cart");
    }

    @Test
    public void testFunciton3(){
        System.out.println("Checkout items");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println(("------After Method - Logging out of the application"));
    }

    @AfterClass
    public void afterClass(){
        System.out.println("----AfterClass - Closing Chrome Browser");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("--AfterTest - Closing the connection to the DB");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite - Closing the connection to the MQ");
    }

}
