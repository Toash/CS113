package CS113.Commons.Exam2;

public class Exam2_9 {
    public static void recPrint(int n) {
        if (n == 0) {
            System.out.print("!");
        }
        else {
            recPrint(n-1);
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        recPrint(3);
    }
}
