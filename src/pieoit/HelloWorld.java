package pieoit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fisrt Number: ");
		int fisrtNumber = scanner.nextInt();
		System.out.println("Second Number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Min : " + Math.min(fisrtNumber, secondNumber));
		scanner.close();
	}
}
