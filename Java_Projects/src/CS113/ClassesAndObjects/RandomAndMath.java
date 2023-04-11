package CS113.ClassesAndObjects;
import java.util.Random;
public class RandomAndMath {
    public static Random gen = new Random();

    public static void main(String[] args) {

        /*
        for(int i = 0; i<100; i++){
            System.out.println(randomGen.nextInt());
        }
        */

        for(int i = 0;i<1000;i++){

            System.out.println();
            System.out.println(gen.nextInt(11));
            System.out.println(gen.nextInt(1,21));
            System.out.println(gen.nextInt(15,21));
            System.out.println(gen.nextInt(-10,0));
            System.out.println();
        }


    }
}
