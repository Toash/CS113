package CS113.Homework.HW4;

import java.util.Random;
import java.util.Scanner;

// Justin Ho
public class CircleTest {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner scan = new  Scanner(System.in);

        Point point1 = new Point(gen.nextInt(1,26),gen.nextInt(1,26));
        Point point2 = new Point(0,0);

        System.out.print("Enter radius for the first circle: ");
        // Input
        Circle circle1 = new Circle(point1, scan.nextInt());
        Circle circle2 = new Circle(point2, 5);

        System.out.println("Summaries of circles:");
        System.out.println("===============================");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("===============================");

        if(circle1.equals(circle2)){
            double distance = circle1.getCenter().distance(circle2.getCenter());
            System.out.println("Since the circle radii are equal, the distance is "+distance);
        }else {
            double avgCircumference = (circle1.circumference() + circle2.circumference()) / 2;
            System.out.println("Since the circle radii aren't equal, the average circumference is " + avgCircumference);
        }




    }
}
