// Justin Ho

package CS113.Homework.HW6;
import CS113.Homework.HW3.Die;

import java.util.Random;
public class Homework_6_Methods {
    public static int[] numberFreq(){
        Random random = new Random();
        //Generate 1000 numbers

        //Count for numbers 0 to 9
        int[] count = new int[10];

        for(int i = 0; i<1000; i++){
            int randomNumber = random.nextInt(0,10);
            count[randomNumber] += 1;
        }

        return count;
    }

    public static  int[] fibo(int total){

        int[] fibo = new int[total];

        if(total == 0){
            fibo[0] = 1;
        }
        if (total == 1) {
            fibo[0] = 1;
            fibo[1] = 2;
        }
        fibo[0] = 1;
        fibo[1] = 2;
        // Fibonacci is based off of the first two numbers: 0 and 1.
        for(int i = 2; i < total; i++){
            // each number of fibo is sum of previous two
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo;
    }

    public static int oddDice(Die[] die){
        int oddCount = 0;

        // Rolling each die
        for(Die Dice : die){
            Dice.roll();
            //Current die is odd
            if(Dice.getFaceValue() % 2 != 0 ){
                oddCount++;
            }
        }

        return oddCount;
    }


}
