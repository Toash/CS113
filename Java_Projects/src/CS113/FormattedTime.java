package CS113;
import java.util.Scanner;

public class FormattedTime {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter seconds: ");
		int seconds = scanner.nextInt();
		
		int remainingSeconds = seconds;
		int hours = SecondsToHours(remainingSeconds);
		remainingSeconds -= (hours*3600);
		int minutes = SecondsToMinutes(remainingSeconds);
		remainingSeconds -= (minutes*60);
		
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + remainingSeconds);
		
	}
	
	public static int SecondsToHours(int seconds) {
		return seconds/3600;
	}
	public static int SecondsToMinutes(int seconds) {
		return seconds/60;
	}
	
}
