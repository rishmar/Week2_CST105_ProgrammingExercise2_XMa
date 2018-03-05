import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");

		System.out.print("Enter a degree in Celsius: ");
		double celsius1 = input.nextDouble();

		// Convert Celsius to Fahrenheit
		double fahrenheit1 = celsius1 * (9.0 / 5) + 32;
		System.out.println("Celsius " + celsius1 + " is " + fahrenheit1 + " in Fahrenheit");
	}
}