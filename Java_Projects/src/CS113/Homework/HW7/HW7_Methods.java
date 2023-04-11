//Justin Ho

package CS113.Homework.HW7;

import CS113.ClassesAndObjects.Dice;
import CS113.Homework.HW3.Die;

public class HW7_Methods {
    // Problem 1
    //Weekly sales for employees for a year.
    int[][] sales;

    //Returns highest amount minus lowest amount from 2d array
    public static int salesRange(int[][] sales){
        int rowLength = sales.length;
        int columnLength = sales[0].length;

        int biggest = sales[0][0];
        int smallest = sales[0][0];

        // Row
        for(int i = 0; i<rowLength; i++){
            // Column
            for(int j = 0; j<columnLength; j++){
                int price = sales[i][j];
                if(price > biggest){
                    biggest = price;
                }
                if(price < smallest){
                    smallest = price;
                }
            }
        }
        return (biggest-smallest);
    }

    // Problem 2
    // Takes 2D array of die objects.
    // Roles each of them
    // Returns an array where each row is number of odd dice.
    public static int[] dieStats(Die[][] dice){
        int rowLength = dice.length;
        int columnLength = dice[0].length;

        int[] oddDiceInRow = new int[2];

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j<columnLength; j++){
                Die die = dice[i][j];

                // Removed die.roll() to test method in TestArrays.
                die.roll();

                // Odd
                if(die.getFaceValue() % 2 != 0){
                    // Increase count for the respective row.
                    oddDiceInRow[i] += 1;
                }

            }
        }
        return oddDiceInRow;
    }

    // Problem 3
    // Recursive, call itself

    // Gets the last digit of num,
    // Removes last digit of num (integer division by 10),
    //      recursively call function with that number
    // Repeat until base case, which is where num == 0.
    // Return, which causes the functions to print from latest called to earliest called.

    public static void printDigits(int num){

        // get last digit, Its remainder when divided by 10
        int lastDigit = (int)num % 10;

        //base case
        if(num == 0){
            return;
        }else {
            // Moves the recursive function closer to the base case
            // Integer division, removes the remainder.
            // Eventually num is a single digit number, in which it
            //      becomes 0 so the function reaches the base case.
            printDigits(num / 10);
        }
        // After base case, keeps returning and
        // printing the digits from right to left.
        System.out.println(lastDigit);


    }

    // Problem 4
    // Recursive solution
    // Returns product of first "count" numbers in array
    // Count is the number of entries in the array to multiply
    //      starting from the 0th index.

    // Starts at the "count"th number, goes down to the 0th indexed number.

    // Recursively calls itself by multiplying the current count number by the count-1 number
    //      (until it reaches the base case)
    // Once base case is reached, it returns, then the function keeps returning until it goes to the function that was called first
    // That number is returned.

    public static int prodArray(int[] numArray, int count){

        // Base case, singular array
        if(count == 0){
            return numArray[0];
        } else {
            // Moves recursive function
            return numArray[count-1] * prodArray(numArray,count-=1);
        }
    }

}
