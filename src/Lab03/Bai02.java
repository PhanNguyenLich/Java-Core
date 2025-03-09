package Lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bảng cửu chương");

		System.out.println("Nhập số nguyên: ");
		int number = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i + " = " + number * i);
		}
		scanner.close();
	}
}
