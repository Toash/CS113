package CS113.Commons.Exam2;

public class Testing {

    public static void main(String[] args) {
        char letter = 'A';
        switch (letter + 2) {
            case 'B': letter +=1; break;
            case 'C': letter +=2;
            default: letter +=1;
        }
        System.out.println(letter);
        System.out.println( (int)'A' );

        if('A'==65){
            System.out.println("Hi");
        }
        if(65 == 'A'){
            System.out.println("Hi");
        }
        if('C'==67){
            System.out.println("Hi");
        }

        // Index out of bound

        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr){
            System.out.print(arr[i]);
            i--;
        }





    }
}
