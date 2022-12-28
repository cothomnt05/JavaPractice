package javap;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex11_String {

	public static void main(String[] args) {
//		System.out.println(deleteStr("Hello Java ,Hello HvitClan", "Hello"));
		
//		System.out.println(isSuccess("nguyendongkhanh@hvitclan.vn", "123456"));	
		
//		System.out.println(lastOfIndex("Hello Java ,Hello HvitClan", "Hello"));
		
//		System.out.println(convertToEmail());
		
//		getDay();
//		Calendar c = Calendar.getInstance();
//		System.out.println(getDay(c));	

//		String name = "Nguyen Van A";
//		String birthday = "5/1/1980";
//		retireInfo(name, birthday);

	}

	public static String deleteStr(String str ,String s) {
		int lastOfIndex = str.lastIndexOf(s);

		str = str.substring(lastOfIndex,str.length()-1);

		return str;
	}
	
	public static boolean isSuccess(String acc, String pss) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("input acc and pss: ");
			String accIn = sc.next();
			sc.nextLine();
			String pssIn = sc.next();
			
			if(acc.equals(accIn) && pss.equals(pssIn)) {
				return true;
			}
		}
		return false;
	} 
	
	public static int lastOfIndex(String str, String s) {
		int lastOfIndex = str.lastIndexOf(s);
		
		return lastOfIndex;
	}
	
	public static String convertToEmail() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("input Str: ");
			String str = sc.nextLine();
			str = str.replace(" ", "").toLowerCase() + "@hvitclan.vn";
			
			return str;
		}
	}
	
	public static void getDay() {
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(ft.format(date));
	}
	
	public static String getDay(Calendar c) {
		int date = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		return date + "/" + month + "/" +  year;
	}
	
	public static void retireInfo(String name, String birthday) {
		String[] bthInt = birthday.split("/");
		int dateBirth = Integer.parseInt(bthInt[0]);
		int monthBirth = Integer.parseInt(bthInt[1]);
		int yearBirth = Integer.parseInt(bthInt[2]);
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(yearBirth + 60, monthBirth, dateBirth);
		System.out.println(name);
		System.out.println(gc.get(Calendar.DAY_OF_MONTH) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.YEAR)) ;
		
		
	}

}
