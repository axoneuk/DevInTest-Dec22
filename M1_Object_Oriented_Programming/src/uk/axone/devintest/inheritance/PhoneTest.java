package uk.axone.devintest.inheritance;

public class PhoneTest {

    public static void main(String[] args) {

        //SmartPhone smartPh = new SmartPhone("Apple");
        //smartPh.receiveCall(93490);

        /*MobilePhone mph = new MobilePhone();
        //methods inherited from the parent class Phone
        mph.receiveCall(930034);
        mph.makeCall(3409340);
        //methods in the MobilePhone class
        mph.playMusic();
        mph.sendSMS();
        //methods inherited from java.lang.Object
        mph.toString();
        mph.hashCode();

        SmartPhone sph = new SmartPhone();
        //methods inherited from the parent class Phone
        sph.makeCall(4334);
        sph.receiveCall(3443);
        //methods inherited from the parent class MobilePhone
        sph.sendSMS();
        sph.playMusic();
        //methods in the SmartPhone class
        sph.installApp("Google Maps");
        sph.getLocation();
        //methods inherited from java.lang.Object
        sph.getClass();*/

        Phone ph1 = new MobilePhone();
        ph1.makeCall(930);

        Phone ph2 = new Phone();
        ph2.receiveCall();
        ph2.receiveCall(493834);
        ph2.receiveCall(349, "erh");

    }

}
