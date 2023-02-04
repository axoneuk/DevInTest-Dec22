package uk.axone.devintest.operators;

public class OperatorDemo {

    //score between 0 and 30 = No Grade
    //score between 30 and 60 = Grade C
    //score between 60 & 80 = Grade B
    //score between 80 & 100 = Grade A
    //score less than 0 or greater than 100 = Invalid Score

    public static void main(String[] args) {
      int score = -8934;

      //score between 0 and 30 = No Grade
      if(score >=0 && score < 30){
          System.out.println("No Grade");
      }
      //score between 30 and 60 = Grade C
        else if(score >=30 && score < 60){
            System.out.println("Grade C");
        }
        //score between 60 & 80 = Grade B
        else if(score >=60 && score < 80){
            System.out.println("Grade B");
        }
        //score between 80 & 100 = Grade A
       else if(score >=80 && score <= 100){
            System.out.println("Grade A");
        }
        //score less than 0 or greater than 100 = Invalid Score
        else{
            System.out.println("Invalid score");
        }
    }

}
