package CS113.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Dice die = new Dice(1);
        Dice die2 = new Dice(3);
        die.roll();
        System.out.println(die.getFaceValue());
        die.roll();
        System.out.println(die.getFaceValue());
        System.out.println(die);
    }
}
