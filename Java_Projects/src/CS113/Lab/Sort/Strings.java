// Justin Ho, Khanh Dang

package CS113.Lab.Sort;
//**********************************************************
// Strings.java
//
// Demonstrates selectionSort on an array of strings.
//**********************************************************
import java.util.Scanner;

public class Strings
{
    //---------------------------------------------
// Reads in an array of strings, sorts them,
// then prints them in sorted order.
//---------------------------------------------
    public static void main (String[] args)
    {
        String[] strList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many strings do you want to sort? ");
        size = scan.nextInt();

        // Clear next line
        scan.nextLine();

        strList = new String[size];

        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            strList[i] = scan.nextLine();

        // String is a comparable object
        //Sorting.selectionSort(strList);
        Sorting.insertionSort(strList);

        System.out.println ("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println ();
    }
}