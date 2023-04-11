package Personal;

public class Factorial {

    public static int factorial(int num){

        // Base case
        if(num == 1){
            return 1;
        }

        // Moves the recursive function to the base case
        return num * factorial(num-1);

    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
