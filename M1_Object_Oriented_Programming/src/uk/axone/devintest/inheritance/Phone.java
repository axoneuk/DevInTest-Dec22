package uk.axone.devintest.inheritance;

public class Phone {

    private String make;
    private String model;
    private int price;

    Phone(){
        System.out.println("Phone Constructor");
    }

    Phone(String make){
        System.out.println("Phone Constructor 2");
        this.make = make;
    }

    void makeCall(int calledNum){
        System.out.println(make +" Phone is calling "+ calledNum);
    }

     void receiveCall(int callingNum){
        System.out.println(make +" Phone is receiving a call from "+ callingNum);
    }

    //receiveCall method is overloaded
    void receiveCall(){

    }

    //receiveCall method is overloaded
    void receiveCall(int callingNum, String voiceMessage){

    }



}
