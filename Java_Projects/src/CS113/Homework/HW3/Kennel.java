package CS113.Homework.HW3;

import java.util.Scanner;
//Justin Ho
public class Kennel {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String dog1Name;
        String dog2Name;

        double dog1Weight;
        double dog2Weight;

        System.out.print("Dog 1 name: ");
        dog1Name = inputScanner.nextLine();
        System.out.print("Dog 1 Weight: ");
        dog1Weight = inputScanner.nextDouble();

        inputScanner.nextLine(); //Clear out next line

        System.out.print("Dog 2 name: ");
        dog2Name = inputScanner.nextLine();
        System.out.print("Dog 2 Weight: ");
        dog2Weight = inputScanner.nextDouble();

        Dog dog1 = new Dog();
        dog1.setName(dog1Name);
        dog1.setWeight(dog1Weight);

        Dog dog2 = new Dog();
        dog2.setName(dog2Name);
        dog2.setWeight(dog2Weight);

        System.out.println(dog1);
        System.out.println(dog2);

        double averageWeightInKg = (dog1.toKgs() + dog2.toKgs()) / 2.0;
        System.out.println("Average weight in Kg: " + averageWeightInKg);




    }
}
