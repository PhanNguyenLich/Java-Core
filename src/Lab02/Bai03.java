package Lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện: ");

		int elecNumber = scanner.nextInt();

		int electricityBill = 0;

		if (elecNumber >= 0 && elecNumber <= 100) {
			electricityBill = elecNumber * 1000;
			System.out.println("Tiền điện: " + electricityBill);
		} else {
			electricityBill = 100 * 1000 + (elecNumber - 100) * 1500;
			System.out.println("Tiền điện: " + electricityBill);
		}

		scanner.close();

	}
}
