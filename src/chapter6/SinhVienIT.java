package chapter6;

public class SinhVienIT extends SinhVien {

	private String programLanguage;

	public SinhVienIT(String id, String name, double price, double tax, String programLanguage) {
		super(id, name, price, tax);
		this.programLanguage = programLanguage;
	}

	public String getProgramLanguage() {
		return programLanguage;
	}

	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}

	public void getMoney() {
		super.info();
	}

	public void info() {
		System.out.println("info SinhVienIT");
	}

}
