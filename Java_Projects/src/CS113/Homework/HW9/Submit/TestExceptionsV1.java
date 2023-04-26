// Justin Ho

package CS113.Homework.HW9.Submit;

import CS113.Homework.HW9.Hourly;

import java.util.Scanner;
public class TestExceptionsV1 {
    public static void main(String[] args) throws NoOvertimeException{
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array: ");
        size = scan.nextInt();
        scan.nextLine();

        // Array of Hourly employees
        Hourly[] hourlyArray = new Hourly[size];

        for(int i=0; i<hourlyArray.length; i++){

            //System.out.println("Enter information for employee "+(i+1) + ": ");
            System.out.print("Name?: ");
            String name = scan.nextLine();
            System.out.print("Address?: ");
            String address = scan.nextLine();
            System.out.print("Phone Number?: ");
            String phone = scan.nextLine();
            System.out.print("Social Security?: ");
            String ssn = scan.nextLine();
            System.out.print("Hourly Rate?: ");
            double rate = scan.nextDouble();
            scan.nextLine();

            Hourly newHourly = new Hourly(name,address,phone,ssn,rate);

            System.out.println("How many hours worked?");
            int hours = scan.nextInt();
            scan.nextLine();

            if(hours > 40){
                NoOvertimeException NoOvertimeException = new NoOvertimeException("Employee cant work over 40 hours");
                throw NoOvertimeException;
            }
            newHourly.addHours(hours);

        }
    }
}
