package javap;

public class Ex10_Maximum_Profit {
	public static int maxProfit(int[] arr) {
		int maxProfit = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int profit = arr[j] - arr[i];
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(maxProfit(arr));

	}

}
