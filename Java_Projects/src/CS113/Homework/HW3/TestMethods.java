package CS113.Homework.HW3;

//Justin Ho
public class TestMethods {
    public static void main(String[] args) {

        Die die1 = new Die(1);
        Die die2 = new Die(2);

        MyMethods myMethods = new MyMethods();

        System.out.println("Volume: " + myMethods.volume(1,1,1));
        System.out.println("Avg face values: " + myMethods.avgFaceValues(die1, die2));
    }
}
