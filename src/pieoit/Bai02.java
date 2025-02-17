package pieoit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chiều dài: ");
		int dai = scanner.nextInt();
		System.out.println("Chiều rộng : ");
		int rong = scanner.nextInt();

		int chu_vi = (dai + rong) * 2;
		int dien_tich = dai * rong;

		System.out.println("Chu vi: " + chu_vi);
		System.out.println("Dien tich: " + dien_tich);
		System.out.println("Cạnh nhỏ nhất: " + Math.min(dai, rong));

		scanner.close();
	}
}
