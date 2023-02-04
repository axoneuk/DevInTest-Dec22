package uk.axone.devintest.abstractclasses;

public class Truck extends Vehicle{

    @Override
    int getNumWheels() {
        return 6;
    }

    @Override
    protected String getFuelType() {
        return "Diesel";
    }

    @Override
    public boolean isElectric() {
        return false;
    }

    @Override
    void brake() {
        System.out.println("Truck is stopping");
    }
}
