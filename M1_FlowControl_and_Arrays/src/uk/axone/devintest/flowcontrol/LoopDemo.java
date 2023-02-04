package uk.axone.devintest.flowcontrol;

public class LoopDemo {

    //Calculate the sum of the first n numbers
    // sum = 1 + 2 + 3 + 4 ...+ n

    int useDoWhile(int n){
        int sum = 0;
        int count = 0;
        //loop starts here
        do{
            sum = sum + count;
            ++count;//count = count + 1;
        } while(count <= n);
        //end of loop
        return sum;
    }

    int useWhile(int n){
        int sum = 0;
        int count = 0;
        //loop starts here
        while(count <=n){
            sum = sum + count;
            count++;
        }
        return sum;
    }

    int useFor(int n){
        int sum = 0;
        for(int count =0; count <= n; count++){
            sum = sum + count;
        }
        return sum;
    }

    public static void main(String[] args) {
        LoopDemo lDemo = new LoopDemo();
        //int sum = lDemo.useDoWhile(5);
        //int sum = lDemo.useWhile(5);
        int sum = lDemo.useFor(5);
        System.out.println(sum);
    }

}
