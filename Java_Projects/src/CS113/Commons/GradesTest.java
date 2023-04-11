package CS113.Commons;
import java.util.Scanner;
import java.util.Random;

public class GradesTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter numerical score: ");
        Grade entry = new Grade(scan.nextInt());
        boolean running = true;
        while(running){

            Grade newEntry = new Grade(random.nextInt(40,101));
            // They are "equal"
            if(newEntry.equals(entry)){
                if(newEntry.getNumGrade() > entry.getNumGrade()){
                    System.out.println(newEntry);
                }
            }
            // Satisfactory and unsatisfactory
            else{
                running = false;
            }
        }
    }

}
