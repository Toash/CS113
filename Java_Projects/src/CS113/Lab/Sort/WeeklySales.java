// Justin Ho, Khanh Dang

package CS113.Lab.Sort;

import CS113.Lab.Sort.Salesperson;
import CS113.Lab.Sort.Sorting;
import java.util.Scanner;

// ******************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ******************************************************************
public class WeeklySales
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales people?");

        int numberOfSalesPeople = scanner.nextInt();

        //Clear next line
        scanner.nextLine();


        Salesperson[] salesStaff = new Salesperson[numberOfSalesPeople];

        for(int i = 0; i<salesStaff.length; i++){
            System.out.println("Enter information for sales person "+(i+1));

            System.out.println("Enter the first name:");
            String firstName = scanner.nextLine();

            System.out.println("Enter the last name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter the sales:");
            int sales = scanner.nextInt();

            //Clear next line
            scanner.nextLine();

            Salesperson newSalesPerson = new Salesperson(firstName,lastName,sales);

            salesStaff[i] = newSalesPerson;
        }


        /*
        Salesperson[] salesStaff = new Salesperson[10];
        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        salesStaff[2] = new Salesperson("James", "Jones", 3000);
        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);


        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week, from most to least\n");
        for (Salesperson s : salesStaff)
            System.out.println (s);

         */
    }
}