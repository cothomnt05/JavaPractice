package javap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex15_List_Set {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 3, 4, 3, 5, 5 };
		List<Integer> t = new ArrayList<>();
		for (Integer number : arr) {
			t.add(number);
		}

//		theNumberIncrese(t);

//		minAndMax(t);

//		reverse(t);

//		List<Integer> list1 = new ArrayList<>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(12);
//		list2.add(122);
//		list2.add(3);
//		list2.add(4);
//
//		numberAppearTwoList(list1, list2);

//		timeAppearInList(t);

//		int[] arr1 = { 1, 2, 4 };
//		int[] arr2 = { 1, 2, 3 };
//
//		Set<Integer> a = creatSet(arr1);
//		displaySet(a);
//		Set<Integer> b = creatSet(arr2);
//		displaySet(b);
//
//		b.removeAll(a);
//		displaySet(b);
//
//		a.clear();
//		displaySet(a);
		
		String[] arr1 = {"1 - Red", "2 - Green", "3 - Blue"};
		String[] arr2 = {"4 - White", "5 - Black", "6 - Orange"};
		
		Set<String> map1 = creatSet(arr1);
		displaySetString(map1);
		
		Set<String> map2 = creatSet(arr2);
		displaySetString(map2);
		
		map1.addAll(map2);
		displaySetString(map1);
		
		
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

	public static void theNumberIncrese(List<Integer> t) {
		for (int i = 0; i < t.size(); i++) {
			if (isIncrease(t.get(i))) {
				System.out.print(t.get(i) + " ");
			}
		}
	}

	public static void minAndMax(List<Integer> t) {
		int min = t.get(0);
		int max = t.get(0);
		for (int i = 0; i < t.size(); i++) {
			if (t.get(i) < min) {
				min = t.get(i);
			}
			if (t.get(i) > max) {
				max = t.get(i);
			}
		}
		System.out.println("min " + min);
		System.out.println("max " + max);
	}

	public static void reverse(List<Integer> t) {

		List<Integer> reverseList = new ArrayList<>();
		for (int i = t.size() - 1; i >= 0; i--) {
			reverseList.add(t.get(i));
		}

		for (int i = 0; i < reverseList.size(); i++) {
			System.out.print(reverseList.get(i) + " ");
		}
	}

	public static void numberAppearTwoList(List<Integer> list1, List<Integer> list2) {
		String result = "";
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					result += list1.get(i) + " ";
				}
			}
		}
		System.out.println(result);
	}

	public static void timeAppearInList(List<Integer> list) {
		int max = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		int[] arr = new int[max + 1];

		for (int i = 0; i < list.size(); i++) {
			arr[list.get(i)]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print(i + "-" + arr[i] + ", ");
			}
		}
	}

	public static Set<Integer> creatSet(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return set;
	}
	
	public static Set<String> creatSet(String[] arr) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return set;
	}

	public static void displaySet(Set<Integer> set) {
		for (Integer integer : set) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}
	
	public static void displaySetString(Set<String> set) {
		for (String string : set) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

}
