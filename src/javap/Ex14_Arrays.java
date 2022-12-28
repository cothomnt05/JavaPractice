package javap;

import java.util.Scanner;

public class Ex14_Arrays {

	public static void main(String[] args) {
//		System.out.println(sumOfArray());

//		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//		printArr(arr);

//		System.out.println(isIncrease(4321));

//		int[] arr = { 1, 4, 7, 8, 9, 6, 3, 2, 5, 4, 6 };
//		System.out.println(average(arr));

//		devide(arr);

//		minAndMaxOfArray(arr);

//		int[] arr1 = {1,2,3};
//		int[] arr2 = {1,2,3};
//		System.out.println(isTwoArrayEqual(arr1, arr2));

//		int[][] a = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
//		int[][] b = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
//		sumTwoArray(a, b);
		
//		System.out.println(convertEmail());
		
//		System.out.println(sumOfS());
		
		System.out.println(sumOfN());

	}

	public static int sumOfArray() {
		int sum = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap do dai mang: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void printArr(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean isIncrease(int n) {
		String str = Integer.toString(n);
		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					return false;
				}
			}
		}

		return true;
	}

	public static double average(int[] arr) {
		double result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}

		result = result / (double) arr.length;

		return result;
	}

	public static void devide(int[] arr) {
		int o = 0;
		int e = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				e++;
			} else {
				o++;
			}

		}

		int[] odd = new int[o];
		int countOdd = 0;
		int[] even = new int[e];
		int countEven = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[countEven++] = arr[i];
			} else {
				odd[countOdd++] = arr[i];
			}

		}

		for (int i = 0; i < even.length; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < odd.length; i++) {
			System.out.print(odd[i] + " ");
		}
	}

	public static void minAndMaxOfArray(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

	public static boolean isTwoArrayEqual(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
		} else {
			return false;
		}

		return true;
	}

	public static void sumTwoArray(int[][] a, int[][] b) {
		int n = a.length;
		int m = a[0].length;
		int[][] c = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static String convertEmail() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input: ");
			String str = sc.nextLine();
			String result = "";
			String[] strArr = str.split(" ");
			for(int i=0; i< strArr.length-1; i++) {
				result += strArr[i].substring(0,1).toUpperCase();
			}
			String name = strArr[strArr.length-1];
			name = name.substring(0,1).toUpperCase() + name.substring(1,name.length()).toLowerCase();
			result = name + result;
			result += "@hvitclan.vn";
			
			return result;
		}
	}
	/*
	 * Viết chương trình tính tổng S(n) = 1/(1×2) + 1/(2×3) +…+ 1/(n*(n+1)) với n là số nguyên dương được nhập từ bàn phím. 
	 * Đầu vào: Số nguyên n 
	 * Đầu ra: Hiển thị kết quả: "Tổng S(n) = ..." 
	 **/
	
	public static double sumOfS() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input n: ");
			int n = sc.nextInt();
			
			return 1 - (double)1/(n+1);
		}
		
	}
	
	public static int sumOfN() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input n: ");
			int sum = 0;
			int n = sc.nextInt();
			for(int i = 0; i< n; i++) {
				sum += sc.nextInt();
			}
			return sum;
		}
	}

}
