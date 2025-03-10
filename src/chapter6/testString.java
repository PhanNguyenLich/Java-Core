package chapter6;

import java.util.ArrayList;

public class testString {
	public static void main(String[] args) {
		Student test = new Student();
		Student st1 = test.InputStudent("Nguyễn Văn A", "1");
		Student st2 = test.InputStudent("Nguyễn Văn B", "2");
		Student st3 = test.InputStudent("Nguyễn Văn C", "3");
		Student st4 = test.InputStudent("Phan Văn A", "4");
		Student st5 = test.InputStudent("Trần Văn A", "5");

		ArrayList<Student> arr = new ArrayList<Student>();

		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println("start with Nguyễn : " + arr.get(i));
			}
		}

		System.out.println("Check arr :" + arr);
	}
}
