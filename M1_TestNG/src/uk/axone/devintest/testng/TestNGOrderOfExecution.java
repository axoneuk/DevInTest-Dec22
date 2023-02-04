package uk.axone.devintest.testng;

import org.testng.annotations.Test;

public class TestNGOrderOfExecution {

    @Test(priority = 0)
    public void login(){
        System.out.println("Login test");
    }

    @Test(priority = 1)
    public void validateHomePage(){
        System.out.println("HomePage Test");
    }

    @Test(priority = 2)
    public void logout(){
        System.out.println("Logout test");
    }
}
