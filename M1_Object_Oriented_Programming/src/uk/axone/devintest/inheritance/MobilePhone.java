package uk.axone.devintest.inheritance;

public class MobilePhone extends Phone{

    public MobilePhone(){
        System.out.println("MobilePhone Constructor");
    }

    MobilePhone(String make){
        super(make);
        System.out.println("MobilePhone Constructor 2");
    }

    void sendSMS(){
        System.out.println("MobilePhone is sending SMS");
    }

    void playMusic(){
        System.out.println("MobilePhone is playing music");
    }

    //makeCall method is overridden
    @Override
     void makeCall(int callingNum){
        System.out.println("MobilePhone is calling "+ callingNum);
    }

    void dosomething(){
        this.makeCall(8034);
        super.makeCall(303);
        receiveCall(4939034);
    }

}
