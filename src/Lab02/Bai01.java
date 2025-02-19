package Lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập hệ số a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập hệ số b: ");
		int b = scanner.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("PT vô số nghiệm");
			} else {
				System.out.println("PT vô nghiệm");
			}
		} else {
			float x = (float) -b / a;
			System.out.printf("Nghiệm của PT: x = %.5f ", x);
		}

		scanner.close();
	}
}
