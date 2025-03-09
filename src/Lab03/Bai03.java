package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử mảng");
		int n = scanner.nextInt();

		int a[] = new int[n];

		System.out.println("Nhập các phần tử cho mảng");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
// 		Sắp xếp mảng
		Arrays.sort(a);

		System.out.println("Mảng sau khi sắp xếp: ");

		System.out.println(Arrays.toString(a));

		int min = a[0];
//		Phần tử nhỏ nhất
		for (int i = 0; i < a.length; i++) {
			min = Math.min(a[i], min);
		}

		System.out.println("Phần tử nhỏ nhất: " + min);

		int max = a[0];
//		Phần tử lớn nhất
		for (int i = 0; i < a.length; i++) {
			max = Math.max(a[i], max);
		}

		System.out.println("Phần tử lớn nhất: " + max);
		scanner.close();
	}
}
