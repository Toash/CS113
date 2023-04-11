//Justin Ho

package CS113.Homework.HW6;
import CS113.Homework.HW3.Die;

public class TestArrays {
    public static void main(String[] args) {

        // NUMBER FREQUENCY
        int[] testFreq = Homework_6_Methods.numberFreq();
        for(int i =0;i<10;i++){
            System.out.println("Occurrences of the number " + i + ": "+ testFreq[i]);
        }

        // FIBONACCI
        int total = 10;
        int[] fibo = Homework_6_Methods.fibo(total);
        // Printing fib
        for(int i=0 ; i<total; i++){
            System.out.println("Fibonacci number " + i + ": " + fibo[i]);
        }

        // ODD DICE
        // Creating array of die objects
        int dieArrSize = 10;
        Die[] dieArr = new Die[dieArrSize];

        for(int i =0; i<dieArrSize; i++){
            dieArr[i] = new Die(1);
        }


        System.out.print(Homework_6_Methods.oddDice(dieArr));
        System.out.print(" Odd dice in the array");
    }
}
