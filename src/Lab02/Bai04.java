package Lab02;

import java.util.Scanner;

public class Bai04 {

	public static void bai01() {
		System.out.println("Lựa chọn tính năng 1");
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

	public static void bai02() {
		System.out.println("Lựa chọn tính năng 2");

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

	public static void bai03() {
		System.out.println("Lựa chọn tính năng 3");

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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.println("Lựa chọn tính năng: ");
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;

		default:
			System.out.println("Kết thúc chương trình");
			System.exit(0);
		}
		scanner.close();
	}
}
