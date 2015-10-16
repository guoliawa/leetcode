package leetcode;

public class AddBinary {

	public static String addBinary(String a, String b) {
		int m = a.length();
		int n = b.length();
		int carry = 0;
		String result = "";
		int MaxLen = Math.max(m, n);
		for (int i = 0; i < MaxLen; i++) {
			int p = 0, q = 0;

			if (i < m)
				p = a.charAt(m - 1 - i) - '0';
			else
				p = 0;

			if (i < n)
				q = b.charAt(n - 1 - i) - '0';
			else
				q = 0;

			int tmp = p + q + carry;
			carry = tmp / 2;
			result = tmp % 2 + result;
		}

		if (carry == 1) {
			return "1" + result;
		} else {
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addBinary("1010", "1011");
	}

}
