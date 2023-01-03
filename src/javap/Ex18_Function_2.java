package javap;

public class Ex18_Function_2 {
	public static void main(String[] args) {
//		System.out.println(roundUpNumber(2.34));
//		System.out.println(roundDoubleNumber(2.34));

//		System.out.println(betweenString("kkkcckkk"));

//		int[] arr = { 2, 1, 2, 3, 1, 4, 3, 4, 7, 1 };
//		System.out.println(numberOnceAppear(arr));

	}

	public static double roundUpNumber(double d) {

		return Math.floor(d * 10) / 10;
	}

	public static double roundDoubleNumber(double d) {

		return Math.ceil(d * 10) / 10;
	}

	public static String betweenString(String s) {
		String result = "";
		int n = s.length();

		if (n % 2 == 1) {
			result += s.charAt(n / 2);
		}

		if (n % 2 == 0) {
			result += s.substring(n / 2 - 1, n / 2 + 1);
		}

		return result;
	}

	public static int numberOnceAppear(int[] nums) {
		int n = nums.length;
		int[] arr = new int[n + 1];

		for (int i = 0; i < n; i++) {
			arr[nums[i]]++;
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				return i;
			}
		}

		return -1;
	}

}
