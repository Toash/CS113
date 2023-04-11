//Justin Ho

package CS113.Homework.HW7;

import CS113.Homework.HW3.Die;

public class TestArraysAndRecursion {
    public static void main(String[] args) {

        // Problem 1
        System.out.println("Problem 1: ");
        int[][] sales = {{200,350,400},{150,375,225}};
        System.out.println(HW7_Methods.salesRange(sales));

        // Problem 2
        System.out.println("Problem 2: ");
        // This code was tested when the roll statement is removed in methods, since rolling it changes the values

        Die[][] dice = {{new Die(2), new Die(4), new Die(6)},
                {new Die(3), new Die(4), new Die(5)}};

        // Printing the array
        System.out.println("["+HW7_Methods.dieStats(dice)[0]+","+HW7_Methods.dieStats(dice)[1]+"]");

        // Problem 3
        System.out.println("Problem 3: ");
        HW7_Methods.printDigits(12345);

        // Problem 4
        System.out.println("Problem 4: ");

        int[] arr = {1,3,2,5};
        System.out.println( HW7_Methods.prodArray(arr,3) );
        System.out.println( HW7_Methods.prodArray(arr,4) );
    }
}
