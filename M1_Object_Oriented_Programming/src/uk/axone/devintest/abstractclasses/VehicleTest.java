package uk.axone.devintest.abstractclasses;

public class VehicleTest {

    public static void main(String[] args) {

        //Abstract classes cannot be instantiated
        //Vehicle myVh = new Vehicle();

       /* Car myCar = new Car("Audi");
        myCar.moveForward();
        myCar.accelerate();*/

        Vehicle v1 = new Car("Audi");
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        v1.brake();
        v2.brake();
        v3.brake();


    }

}
