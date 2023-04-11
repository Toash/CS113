// Group members: Justin Ho, Khanh Dang

package CS113.Lab.Mar20;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
        ;
//        Scanner scan = new Scanner((new File("magicData").getAbsolutePath()));
        Scanner scan = new Scanner(new File("magicData"));
        int count = 1; //count which square we're on
        int size = scan.nextInt(); //size of next square
//Expecting -1 at bottom of input file
        while (size != -1)
        {
//create a new Square of the given size
            Square squareObj = new Square(size);
            squareObj.readSquare(scan);
//call its read method to read the values of the square
            System.out.println("\n** Square " + count + " **");
//print the square
            squareObj.printSquare();
//print the sums of its rows
            System.out.println("Sum of the square's rows");
            System.out.println("==========================");
            for(int i = 0; i < squareObj.square.length; i++){
                System.out.print("Row "+(i+1) + ": ");
                System.out.println(squareObj.sumRow(i));
            }
            System.out.println("==========================");
//print the sums of its columns
            System.out.println("Sum of the square's columns");
            System.out.println("==========================");
            for(int i = 0; i < squareObj.square.length; i++){
                System.out.print("Column "+(i+1)+ ": ");
                System.out.println(squareObj.sumCol(i));
            }
            System.out.println("==========================");
//print the sum of the main diagonal
            System.out.println("Sum of main diagonal");
            System.out.println("==========================");
            System.out.println(squareObj.sumMainDiag());
            System.out.println("==========================");
//print the sum of the other diagonal
            System.out.println("Sum of other diagonal");
            System.out.println("==========================");
            System.out.println(squareObj.sumOtherDiag());
            System.out.println("==========================");
//determine and print whether it is a magic square
            if(squareObj.magic()){
                System.out.println("It is a magic square!");
            }else{
                System.out.println("It is not a magic square.");
            }
//get size of next square
            size = scan.nextInt();
        }
    }
}