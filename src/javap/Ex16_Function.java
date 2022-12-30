package javap;

import java.util.Scanner;

public class Ex16_Function {

	public static void main(String[] args) {
//		displayNumber();

//		String str = "Hvit Clan Is Number One ";
//		System.out.println(getSpaceNumberInString(str));

//		int[] arr = { 5, 5, 4, 6, 7, 3 };
//		System.out.println(sumOfArray(arr));

//		int[] arr = { 1, 4, 7, 8, 9, 6, 3, 2, 5 };
//		theFistEven(arr);

//		int r = 3;
//		System.out.println("perimeter: " + perimeter(r));
//		System.out.println("area: " + area(r));
	}

	public static void displayNumber() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input: ");
			int a = sc.nextInt();
			System.out.println("Input number is " + a);
		} catch (Exception e) {
			System.out.println("Wrong Data Type");
		}
	}

	public static int getSpaceNumberInString(String str) {
		int lengthAfterRemoveSpace = 0;
		String[] strArray = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			lengthAfterRemoveSpace += strArray[i].length();
		}

		return str.length() - lengthAfterRemoveSpace;
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}

		return sum;
	}

	public static void theFistEven(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static double perimeter(int r) {
		return 2 * 3.14 * r;
	}
	
	public static double area(int r) {
		return 3.14 * 3.14 * r;
	}

}
