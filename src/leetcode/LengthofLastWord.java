package leetcode;

public class LengthofLastWord {
	// http://blog.csdn.net/yiding_he/article/details/18731023

	public int lengthOfLastWord(String s) {
		int result = 0;

		if (s == null || s.length() == 0)
			return 0;

		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				result++;
			}
			if (s.charAt(i) == ' ' && result != 0) {
				return result;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
