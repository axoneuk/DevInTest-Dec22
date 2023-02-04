package uk.axone.devintest.polymorphism;

import uk.axone.devintest.abstractclasses.Vehicle;
import uk.axone.devintest.inheritance.Phone;
import uk.axone.devintest.interfaces.Bank;

public class House {

    private String name;
    private String address;
    private int numRooms;
    private boolean isFlat;

    private Phone ph;
    private Vehicle vh;
    private Bank bk;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public boolean isFlat() {
        return isFlat;
    }

    public void setFlat(boolean flat) {
        isFlat = flat;
    }

    public Phone getPhone() {
        return ph;
    }

    public void setPhone(Phone ph) {
        this.ph = ph;
    }

    public Vehicle getVehicle() {
        return vh;
    }

    public void setVehicle(Vehicle vh) {
        this.vh = vh;
    }

    public Bank getBank() {
        return bk;
    }

    public void setBank(Bank bk) {
        this.bk = bk;
    }
}
