package CS113.Commons;
import java.util.Scanner;
import java.util.Random;
public class CircleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();

        System.out.print("Enter a radius: ");
        Circle circle1 = new Circle(scan.nextInt());

        Circle circle2 = new Circle(gen.nextInt(5,16));

        System.out.println(circle1.area());
        System.out.println(circle2.area());

        System.out.println(circle1);
        System.out.println(circle2);

        int temp = circle1.getRadius();
        circle1.setRadius(circle2.getRadius());
        circle2.setRadius(temp);
        System.out.println(circle1);
        System.out.println(circle2);

    }
}
