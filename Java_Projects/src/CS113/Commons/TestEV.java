package CS113.Commons;
import java.util.Random;
import java.util.Scanner;
public class TestEV {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner scan = new Scanner(System.in);

        EV Tesla = new EV(gen.nextInt(250,301),"Tesla Model S");
        System.out.print("Enter Range: ");
        int inputRange = scan.nextInt();

        //clear newline
        scan.nextLine();

        System.out.println("Enter Model: ");

        String inputModel = scan.nextLine();

        EV InputEV = new EV(inputRange,inputModel);

        int res = Tesla.compareTo(InputEV);

        //Tesla more range
        if(res == 1){
            System.out.println(Tesla);
        } else if(res == -1){
            System.out.println(InputEV);
        }else {
            System.out.println("Same");
        }

        if(Tesla.sameModel(InputEV)){
            System.out.println("Same model");
        } else{
            System.out.println("Not of the same model.");
        }

    }
}
