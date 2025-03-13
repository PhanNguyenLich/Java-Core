package chapter6;

public class Video421 {
	public static void main(String[] args) {
		SinhVienIT it1 = new SinhVienIT("12344", "Pieo", 10, 0.1, "java");
		System.out.println("Check it1 = " + it1.id);

		SinhVienCoKhi ck1 = new SinhVienCoKhi("12344", "Pieo", 10, 0.1, "machine");
		System.out.println("Check ck1 = " + ck1.getSkill());
		it1.getMoney();
		it1.info();
	}
}
