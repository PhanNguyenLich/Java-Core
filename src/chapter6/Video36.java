package chapter6;

import java.util.Scanner;

public class Video36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập vào usename: ");
		String usename = scanner.nextLine();

		System.out.printf("Nhập vào password: ");
		String password = scanner.nextLine();

		System.out.println("username = " + usename + " password = " + password);

		if (usename.equals("pieo") && password.length() > 6) {
			System.out.println("Valid input");
		}
		scanner.close();
	}
}
