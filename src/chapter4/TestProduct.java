package chapter4;

import java.util.Scanner;

public class TestProduct {
	public static void main(String[] args) {

		Product pd1 = new Product();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin sản phẩm:");
		System.out.println("Nhập tên:");
		String name = scanner.nextLine();
		System.out.println("Nhập giá:");
		double price = scanner.nextDouble();
		System.out.println("Nhập thuế:");
		double tax = scanner.nextDouble();
		scanner.close();

		Product pr1 = pd1.nhapThongTin(name, price, tax);

		pd1.xuatThongTin(pr1);

		System.out.println("Checkout Tax = " + pd1.getTaxPrice(pr1.getPrice(), pr1.getTax()));

	}
}
