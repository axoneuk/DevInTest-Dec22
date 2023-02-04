package uk.axone.devintest.abstractclasses;

public abstract class Vehicle {

    private String make;

    Vehicle(){
        System.out.println("Vehicle Constructor");
    }

    Vehicle(String make){
        this.make = make;
    }

    //Abstract methods
    abstract int getNumWheels();
    protected abstract String getFuelType();
    public abstract boolean isElectric();
    abstract void brake();

    //Non-abstract methods
    void moveForward(){
        System.out.println(make +" Vehicle is moving forward");
    }

    void accelerate(){
        System.out.println(make + " Vehicle is accelerating");
    }

    static void doSomething(){

    }

    public static void main(String[] args) {
        Vehicle.doSomething();
    }

}
