package uk.axone.devintest.interfaces;

public interface Bank extends Company, FinancialInstitution{

    //All variables in an interface are public, static and final
    //they are constants
    public static final int FIN_INST_TYPE = 1;

    //All methods in an interface are public and abstract
    public abstract void depositCash(int amount);
    boolean withdrawCash(int amount);
    int checkBalance();

    public static void display(){
        System.out.println("Display something");
    }

    default void doSomething(){
        System.out.println("Do something");
    }
}
