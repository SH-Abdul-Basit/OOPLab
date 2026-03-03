package Lab04;

public class Task01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		System.out.println((a<<2) + (b>>2));
		// >> and << does not change the original values
		System.out.println("(a++ != b++) && (a++ ==b++) = " + ((a++ != b++) && (a++ ==b++)));
		// Reseting the values
		a = 5;
		b = 4;
		System.out.println("(--a != --b) | (--a == --b) = " + ((--a != --b) | (--a == --b)));
	}
}
