import java.util.Scanner;

public class JavaApplication {

	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a five digits number: ");
		int number = input.nextInt();
		int numbera = number % 10;
		int numberb = number / 10;
		int numberc = numberb % 10;
		int numberd = numberb / 10;
		int numbere = numberd % 10;
		int numberf = numberd / 10;
		int numberg = numberf % 10;
		int numberh = numberf / 10;
		int numberi = numberh % 10;

		// Add each digit.
		int sum = numbera + numberc + numbere + numberg + numberi;
		System.out.println("The sum of the five digits is " + sum);
	}
}
