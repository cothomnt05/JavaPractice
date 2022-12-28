package javap;

import java.util.Scanner;

public class Ex01_Roman_Numeral {
	public int coverToAnInteger(String romanNum) {
		int sum = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			switch (romanNum.charAt(i)) {
			case 'I':
				sum += 1;
				break;
			case 'V':
				sum += 5;
				break;
			case 'X':
				sum += 10;
				break;
			case 'L':
				sum += 50;
				break;
			case 'C':
				sum += 100;
				break;
			case 'D':
				sum += 500;
				break;
			case 'M':
				sum += 1000;
				break;
			default:
				System.out.println("data is not roman numeral");

			}
		}
		if (romanNum.contains("IV")) {
			sum -= 2;
		}
		if (romanNum.contains("IX")) {
			sum -= 2;
		}
		if (romanNum.contains("XL")) {
			sum -= 20;
		}
		if (romanNum.contains("XC")) {
			sum -= 20;
		}
		if (romanNum.contains("CD")) {
			sum -= 200;
		}
		if (romanNum.contains("CM")) {
			sum -= 200;
		}

		return sum;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input roman numeral: ");
			Ex01_Roman_Numeral num = new Ex01_Roman_Numeral();
			String romanNum = sc.next();
			sc.nextLine();
			System.out.println(romanNum + " cover to an Integer is " + num.coverToAnInteger(romanNum));
		}
	}
}
