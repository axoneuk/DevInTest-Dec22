package uk.axone.devintest.objects;

public class HumanBeingTest {

    public static void main(String[] args) {

       /* HumanBeing ram = new HumanBeing();
        ram.name = "Ram D";
        ram.gender = "male";*/

        HumanBeing tracey = new HumanBeing("Tracey F");
        tracey.gender ="female";
        tracey.talk();
        tracey.sleep();

        //the compiler allows us to access static variables and methods using an instance, but its not appropriate
        //System.out.println(tracey.NUM_HANDS);
        //tracey.clap();

        //static variables and methods should always be accessed directly using the class name, an instance is not required
        System.out.println(HumanBeing.NUM_EYES);
        HumanBeing.clap();

        HumanBeing karthik = new HumanBeing("Karthik G", "B+");




    }

}
