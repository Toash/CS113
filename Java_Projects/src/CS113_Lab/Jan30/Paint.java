//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************


/*
 * GROUP MEMBERS: JUSTIN HO, KHANH DANG
 */

package CS113_Lab.Jan30;
import java.util.Scanner;


public class Paint
{
    public static void main(String[] args)
    {
    	System.out.println("Test");
        final int COVERAGE = 350;
        //paint covers 350 sq ft/gal
		//declare integers length, width, and height;
        int length;
        int width;
        int height;
        
		//declare double totalSqFt;
        double totalSqFt;
        
        
        int doorSquareFootage = 20;
        int windowSquareFootage = 15; 
        int doorCount = 0;
        int windowCount = 0;
        
		//declare double paintNeeded;
        double paintNeeded;
        
		//declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);
        
		//Prompt for and read in the length of the room
        System.out.print("Length of the room in feet: ");
        length = scanner.nextInt();
        
		//Prompt for and read in the width of the room
        System.out.print("Width of room in feet: ");
        width = scanner.nextInt();
        
		//Prompt for and read in the height of the room
        System.out.print("Height of room  in feet: ");
        height = scanner.nextInt();
        
        System.out.print("How many doors are there? ");
        doorCount = scanner.nextInt();
        
        System.out.print("How many windows are there? ");
        windowCount = scanner.nextInt();
        
		//Compute the total square feet to be painted--
		//about the dimensions of each wall
        // Painting the walls
        totalSqFt = (2*width*height) + (2*length*height);
        
        // dont want to paint doors and windows
        totalSqFt -= (doorCount*doorSquareFootage + windowCount*windowSquareFootage);

		//Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;
		//Print the length, width, and height of the room and the
        System.out.println();
        System.out.println("The length of the room is " + length);
        System.out.println("The width of the room is " + width);
        System.out.println("The height of the room is " + height);
        System.out.println();
		//number of gallons of paint needed.
        System.out.println(paintNeeded + " gallons of paint needed");
    }
}