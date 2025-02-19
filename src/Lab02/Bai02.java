package Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void GiaiPT(int a, int b) {
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

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập hệ số a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập hệ số b: ");
		int b = scanner.nextInt();
		System.out.println("Nhập hệ số c: ");
		int c = scanner.nextInt();

		if (a == 0) {
			GiaiPT(b, c);
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("PT vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Nghiệm kép x = %.5f", x);
			} else {
				float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

				System.out.printf("PT có 2 nghiệm phân biệt x1 = %.5f và x2 = %.5f", x1, x2);

			}
		}
		scanner.close();
	}
}
