package javap;

public class Ex17_Has_A {
	public static void main(String[] args) {
		Address ad = new Address("Đồng Sơn", "Nam Trực", "Nam Định");
		Student studentA = new Student(0, "Lê Thảo", ad);
		studentA.display();
	}
	
	

}
