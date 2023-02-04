package uk.axone.devintest.abstractclasses;

public class Bike extends Vehicle{


    @Override
    int getNumWheels() {
        return 2;
    }

    @Override
    protected String getFuelType() {
        return "None";
    }

    @Override
    public boolean isElectric() {
        return true;
    }

    @Override
    void brake() {
        System.out.println("Bike is stopping");
    }
}
