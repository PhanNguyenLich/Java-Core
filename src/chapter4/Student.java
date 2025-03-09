package chapter4;

public class Student {

//	Class Attributes
	private String name;
	private int age;
	private String address;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Class method
	public void learnJava() {
		System.out.println("Learn Java");
	}

	public void learnJava(int a) {
		System.out.println("Learn Java");
	}

}
