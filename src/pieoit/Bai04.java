package pieoit;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tiền thuế của bạn: ");
		int tax = scanner.nextInt();
		if (tax < 10)
			System.out.println("Không đóng thuế");
		if (tax >= 10 && tax <= 15) {
			System.out.println("Thuế 10%");
		}
		if (tax >= 15 && tax <= 30) {
			System.out.println("Thuế 20%");
		}
		if (tax > 30) {
			System.out.println("Thuế 50%");
		}

		scanner.close();
	}
}
