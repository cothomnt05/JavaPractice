package javap;

public class Ex07_Kadane_Algorithm {
	public static int maxSubArraySum(int[] arr) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < arr.length; i++) {
			max_ending_here += arr[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}

		return max_so_far;

	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArraySum(arr));

	}

}
