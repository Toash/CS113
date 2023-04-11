package CS113_Lab.Jan30;

import java.util.Scanner;

/*
 * Computing numbers with the input from scanner
 */
public class Trace {
	public static void main(String[] args) {
		double first;
		double second;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Computing the modulo");
		
		System.out.print("Enter first number: ");
		first = scanner.nextDouble();
		System.out.print("Enter second number: ");
		second = scanner.nextDouble();
		
		double modulo = first % second;
		//System.out.println("The modulo is "+ modulo);
		System.out.println(String.format(
				"The modulo computed for numbers %s and %s is %s", first,second,modulo));
		
	}
}
