package uk.axone.devintest.objects;

public class HumanBeing {

    //instance variables, non-static variables
    String name;
    String gender;
    int age;
    int height;
    String eyeColour;
    String bloodGp;
    int weight;

    //Class variables, static variables
    final static int NUM_LEGS = 2;
    final static int NUM_HANDS = 2;
    final static int NUM_EYES = 2;

    HumanBeing(String hName){
        this.name = hName;
        breathe();
    }

    HumanBeing(String name, String gender){
        this.name = name;
        this.gender = gender;
        breathe();
    }

    HumanBeing(String hName, int age){
        breathe();
    }

    HumanBeing(int age, String hName){

    }

    HumanBeing(String hName, int age, int height){

    }

    //the talk method is overloaded
    void talk(){
        //static variables cannot be initialised in a method
        //static int x  = 10;
        System.out.println(name + " is taking");
    }

    void talk(int loudness){
        System.out.println(name + " is taking with a loudness of "+ loudness);
    }

    void talk(String language){
        System.out.println(name + " is taking in "+ language);
    }

    void talk(String lang, int loudness){

    }

    void eat(){
        System.out.println(name + " is eating with "+ NUM_HANDS + " hands");
    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }

    void breathe(){
        System.out.println(name + " is breathing");
    }

    //only static variables can be used in a static method
    static void clap(){
        System.out.println("HumanBeing is clapping with "+ NUM_HANDS + " hands");
    }

}
