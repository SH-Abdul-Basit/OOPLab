package Lab04;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius: ");
		Double celsius = input.nextDouble();
		Double farenheit = celsius * 9 / 5 + 32;
		System.out.println("Temperature in farenheit is : " + farenheit);
		String weather = farenheit < 97 ? "Good" : "Bad";
		System.out.println("Greeting : " + weather + " Weather");
		input.close();
	}
}
