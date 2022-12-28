package javap;

import java.util.Scanner;

public class Ex12_Data_Type {

	public static void main(String[] args) {
//		System.out.println(output());

//		System.out.println(distanceFromPointToLine());

//		dataType();
		
		calculation();
	}

	public static String output() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input: ");
			int a = sc.nextInt();
			double b = sc.nextDouble();
			char c = sc.next().charAt(0);
			boolean d = sc.nextBoolean();
			String e = Boolean.toString(d).substring(0, 1).toUpperCase()
					+ Boolean.toString(d).substring(1, Boolean.toString(d).length());

			String result = Integer.toString(a) + Double.toString(b) + c + e;

			return result;
		}
	}

	public static double distanceFromPointToLine() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input a,b,c,x,y: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			double distance = Math.abs(a * x + b * y + c) / Math.sqrt(a * a + b * b);

			return distance;
		}
	}

	public static void dataType() {
		int a = 1;
		int b = 2;
		int c = 3;
		double d = 1.2;
		double e = 3.4;
		double f = 5.6;
		char g = 'a';
		char h = 'b';
		char i = 'c';
		String str1 = "abc";
		String str2 = "def";
		String str3 = "ghi";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}
	
	public static void calculation() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input a,b: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("a + b = " + (a + b));
			System.out.println("a - b = " + (a - b));
			System.out.println("a * b = " + (a * b));
			System.out.println("a / b = " + ((double)a / b));
			System.out.println("a % b = " + (a % b));
		}
		
	}

}
