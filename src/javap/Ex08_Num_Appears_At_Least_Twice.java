package javap;

public class Ex08_Num_Appears_At_Least_Twice {
	public static boolean numAppearsAtLeastTwiceInArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 6, 2, 7 };
		System.out.println(numAppearsAtLeastTwiceInArray(arr));
	}

}
