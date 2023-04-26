// Justin Ho

package CS113.Homework.HW9.Submit;
import CS113.Homework.HW9.Hourly;

import java.util.Scanner;
public class TestExceptionsV2 {
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

            try{
                System.out.println("How many hours worked?");
                int hours = scan.nextInt();
                scan.nextLine();
                if(hours > 40){
                    throw new NoOvertimeException("Employee cant work over 40 hours");
                }
                newHourly.addHours(hours);

            } catch (NoOvertimeException e){
                // Print message
                System.out.println(e.getMessage());

                // Keep hours worked zero (dont do anything)
                //newHourly.addHours(0);

                // Continue adding more data
            }

            hourlyArray[i] = newHourly;
        }


        int totalHours = 0;
        for(Hourly hourlyEmployee : hourlyArray){
            // valid employees (under 40 hours worked inclusive)
            totalHours += hourlyEmployee.pay();
        }
        System.out.println("Total number of employees: "+ size);
        System.out.println("Total number of hours worked: " + totalHours);
        System.out.println("Average hours worked: " + (totalHours/size));
    }
}
