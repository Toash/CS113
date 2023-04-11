// Justin Ho

package CS113.Homework.HW5;

import java.util.Scanner;

public class TestBooks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many Java books do you have in your library?");
        int numBooks = scan.nextInt();

        scan.nextLine(); // Clear next line

        // Loop variables
        int allCurrentPages = 0;
        int currentBookCount = 0;
        double averagePages =0;

        Book largestBook = new Book(0, "NADA");

        for(int i = 0; i < numBooks;i++){
            System.out.println("Title for book "+ (i+1) + "?");
            String currentTitle = scan.nextLine();

            System.out.println("Page count for book "+ (i+1) + "?");
            int currentPages = scan.nextInt();

            scan.nextLine(); //clear buffer

            Book newBook = new Book(currentPages,currentTitle);
            currentBookCount += 1;

            if(newBook.pages >= largestBook.pages){
                largestBook = newBook;
            }

            allCurrentPages += newBook.pages;
            averagePages = (double)allCurrentPages / currentBookCount;
        }
        System.out.println("Average number of pages: " + averagePages);
        System.out.println("The biggest book!!!: " + largestBook);
    }
}
