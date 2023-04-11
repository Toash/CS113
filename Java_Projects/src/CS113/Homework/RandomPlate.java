package CS113.Homework;
import java.util.Random;

//Justin Ho
public class RandomPlate {
    public static String GetRandomPlate(){
        Random gen = new Random();

        // Random letters
        char l1 = (char)('A' + gen.nextInt(0,26));
        char l2 = (char)('A' + gen.nextInt(0,26));
        char l3 = (char)('A' + gen.nextInt(0,26));

        // Random digits
        int d1 = gen.nextInt(0,10);
        int d2 = gen.nextInt(0,10);
        int d3 = gen.nextInt(0,10);
        int d4 = gen.nextInt(0,10);

        String randomPlate = String.format("%c%c%c%d%d%d%d",l1,l2,l3,d1,d2,d3,d4);

        return randomPlate;
    }
    public static void main(String[] args) {

        for(int i = 0; i<100; i++){
            System.out.println(GetRandomPlate());
        }

    }
}
