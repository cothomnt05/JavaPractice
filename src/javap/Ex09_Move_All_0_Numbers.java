package javap;

public class Ex09_Move_All_0_Numbers {
	public static int[] moveAll0NumbersToTheEnd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 3, 0, 0, 5 };
		moveAll0NumbersToTheEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
