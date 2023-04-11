package CS113.Lab;
import java.util.Random;
//Justin Ho
public class RollingDice {
    public static void RollTwoDice(){
        Random gen = new Random();

        int dice1 = gen.nextInt(1,7);
        int dice2 = gen.nextInt(1,7);

        int total = dice1 + dice2;

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Total roll: " + total);
    }
    public static void main(String[] args) {
        RollTwoDice();
    }
}
