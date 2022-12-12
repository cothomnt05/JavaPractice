package javap;

public class Ex05_Subsequence {
	public static boolean isSubsequence(String s, String t) {
		String newStr = "";
		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (t.charAt(i) == s.charAt(j)) {
					newStr += t.charAt(i);
					break;
				}
			}
			System.out.println(newStr);
		}
		if (newStr.equals(s)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println("s is a subsequence of t: " + isSubsequence("bb", "acbbd"));

	}
}
