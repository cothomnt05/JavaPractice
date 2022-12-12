package javap;

import java.util.Scanner;

public class Ex03_Random_Shuffling_String {
	public void addedLetter(String s, String t) {
		for (int i = 0; i < t.length(); i++) {
			if (!s.contains(Character.toString(t.charAt(i)))) {
				System.out.println("Added letter is " + t.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input s,t: ");
		String s = sc.next();
		sc.nextLine();
		String t = sc.next();
		sc.nextLine();

		Ex03_Random_Shuffling_String letter = new Ex03_Random_Shuffling_String();
		letter.addedLetter(s, t);
	}

}
