package uk.axone.devintest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencies {

    @Test(priority = 0)
    public void launchWebsite(){
        System.out.println("Launching website");
    }

    @Test(priority = 1)
    public void launchWebsite2(){
        System.out.println("Launching website 2");
    }

    @Test(dependsOnMethods = {"launchWebsite"})
    public void loginToWebsite(){
        System.out.println("Logging into website");
    }

    @Test(dependsOnMethods = {"loginToWebsite","launchWebsite"})
    public void addProductsToCart(){
        System.out.println("Adding products to cart");
        Assert.assertFalse(true);
    }

    @Test(dependsOnMethods = "addProductsToCart")
    public void checkOut(){
        System.out.println("Checking out items ....");
    }

}
