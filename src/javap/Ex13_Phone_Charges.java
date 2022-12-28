package javap;

public class Ex13_Phone_Charges {

	public static void main(String[] args) {
		System.out.println(phoneCharge(180));

	}

	public static int phoneCharge(int time) {
		int result = 0;
		if(time <= 50) {
			result += time *1000;
		}
		else if(time > 50 && time <=150) {
			result += 50* 1000 + (time-50) * 700;
		}
		else if(time > 150 && time < 200) {
			result += 50*1000 + 100 * 700 + (time - 150) * 500;
		}
		
		result += 10000;
		
		return result;
	}
}
