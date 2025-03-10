package chapter6;

public class Student {
	private String name;
	private String id;

	public Student() {

	}

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student InputStudent(String name, String id) {
		Student st = new Student(name, id);
		return st;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public void OutputStudent(Student st) {
		System.out.println("Thông tin sinh viên : " + st.getId() + " " + st.getName());
	}

}
