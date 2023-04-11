package CS113;
public class FahrenheitAndCelsius {

	
	public static void main(String[] args) {
		
		//Made up temperature in fahrenheit
		double fahrenheit_temp = 36.5;
		double celsius_temp = FahrenheitToCelsius(fahrenheit_temp);
		
		System.out.println("Temperature in fahrenheit is: " + fahrenheit_temp);
		System.out.println("Temperature in celsius is: "+ celsius_temp);
		
		
	}
	public static double FahrenheitToCelsius(double fah) {
		return ((fah-32.0)*5.0)/9.0;
	}
}
