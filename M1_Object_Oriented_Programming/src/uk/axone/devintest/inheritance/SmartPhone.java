package uk.axone.devintest.inheritance;

public class SmartPhone extends MobilePhone{

    public SmartPhone(){
        System.out.println("SmartPhone Constructor");
    }

    SmartPhone(String make){
        super(make);
        System.out.println("SmartPhone Constructor 2");
    }

    void installApp(String appName){

    }

    void getLocation(){

    }

}
