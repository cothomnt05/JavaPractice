package javap;

import java.util.Scanner;

public class Ex04_Sum_Two_Non_Negative {
	public String sumTwoNonNegative(String a, String b) {
		return Integer.toString((Integer.parseInt(a) + Integer.parseInt(b)));
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input a,b: ");
			String a = sc.next();
			sc.nextLine();
			String b = sc.next();
			sc.nextLine();
			Ex04_Sum_Two_Non_Negative sum = new Ex04_Sum_Two_Non_Negative();
			System.out.println("a + b = " + sum.sumTwoNonNegative(a, b));
		}
	}

}
