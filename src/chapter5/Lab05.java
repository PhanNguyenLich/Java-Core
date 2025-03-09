package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		while (true) {
			System.out.printf("Nhập số bất kỳ :");
			double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine();

			System.out.printf("Nhập thêm (Y/N))?");
			String option = scanner.nextLine();

			if (option.equals("N") || option.equals("n")) { // why using equals ?
				break;
			}
		}

		System.out.println("Check List :" + list);
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		System.out.println("Check sum = " + sum);
		scanner.close();
	}

}
