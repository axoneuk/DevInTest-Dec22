package uk.axone.devintest.polymorphism;

import uk.axone.devintest.abstractclasses.Bike;
import uk.axone.devintest.abstractclasses.Car;
import uk.axone.devintest.abstractclasses.Truck;
import uk.axone.devintest.inheritance.MobilePhone;
import uk.axone.devintest.inheritance.SmartPhone;
import uk.axone.devintest.interfaces.Barclays;
import uk.axone.devintest.interfaces.HSBC;

public class HouseTest {

    public static void main(String[] args) {

        House ramsHouse = new House();
        ramsHouse.setName("Arnwood");
        ramsHouse.setAddress("wokingham");
        ramsHouse.setNumRooms(2);
        ramsHouse.setFlat(true);

        MobilePhone mph = new MobilePhone();
        ramsHouse.setPhone(mph);
        Car myCar = new Car("Ford");
        ramsHouse.setVehicle(myCar);
        HSBC myBank = new HSBC("902","29");
        ramsHouse.setBank(myBank);

        House tomsHouse = new House();
        tomsHouse.setName("OakView");

        tomsHouse.setPhone(new SmartPhone());
        tomsHouse.setVehicle(new Truck());
        tomsHouse.setBank(new Barclays());

    }
}
