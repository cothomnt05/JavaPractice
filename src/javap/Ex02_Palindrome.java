package javap;

import java.util.Scanner;

public class Ex02_Palindrome {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		String newStr1 = new StringBuilder(s.substring(0, s.length() / 2)).reverse().toString();
		String newStr2 = s.length() % 2 == 1 ? s.substring(s.length() / 2 + 1, s.length())
				: s.substring(s.length() / 2, s.length());
		if (newStr2.equals(newStr1)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input s: ");
		String s = sc.next();
		sc.nextLine();
		Ex02_Palindrome num = new Ex02_Palindrome();
		System.out.println("String is a palindrome: " + num.isPalindrome(s));

	}

}
