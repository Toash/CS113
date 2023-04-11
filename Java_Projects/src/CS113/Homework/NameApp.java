package CS113.Homework;
import java.util.Scanner;

//Justin Ho
public class NameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first_name;
        String last_name;

        System.out.print("What is your first name? ");
        first_name = scanner.nextLine();
        System.out.print("What is your last name? ");
        last_name = scanner.nextLine();

        System.out.println(String.format("Your initials are %s%s", first_name.substring(0,1),last_name.substring(0,1)));

        double avg_length = (first_name.length()+last_name.length())/2.0;

        System.out.println("Average length of first and last: " + avg_length);
    }
}
