package Lab03;

import java.util.Scanner;

public class Bai01 {
	public static boolean kiemtraSNT(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 1 số nguyên : ");
		int number = scanner.nextInt();

		if (kiemtraSNT(number)) {
			System.out.println(number + " là số nguyên tố");
		} else {
			System.out.println(number + " không phải là số nguyên tố");
		}

		scanner.close();
	}
}
