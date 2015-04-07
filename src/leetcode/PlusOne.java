package leetcode;

public class PlusOne {

	public int[] plusOne(int[] digits) {
		int length = digits.length;
		for (int i = length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				break;
			} else {
				digits[i] = 0;
			}
		}

		int[] newdigits;
		if (digits[0] == 0) {
			newdigits = new int[length + 1];
			newdigits[0] = 1;
			for (int i = 1; i < length + 1; i++) {
				newdigits[i] = digits[i - 1];
			}
		} else {
			newdigits = new int[length];
			for (int i = 0; i < digits.length; i++) {
				newdigits[i] = digits[i];
			}
		}
		return newdigits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
