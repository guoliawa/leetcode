package leetcode;

public class StringtoInteger {

	public int atoi(String str) {
		int max = Integer.MAX_VALUE;
		int min = -Integer.MIN_VALUE;

		long result = 0;

		str = str.trim();
		int len = str.length();
		if (len < 1)
			return 0;

		int start = 0;
		boolean negative = false;
		if (str.charAt(start) == '-' || str.charAt(start) == '+') {
			negative = (str.charAt(start) == '-');
			start++;
		}

		for (int i = start; i < len; i++) {
			char ch = str.charAt(i);

			if (ch < '0' || ch > '9')
				break;
			result = 10 * result + (ch - '0');
			if (!negative && result > max)
				return max;
			if (negative && -result < min)
				return min;
		}
		if (negative)
			result = -result;

		return (int) result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringtoInteger a = new StringtoInteger();
		String testStr = "  -0012a42";
        a.atoi(testStr);
	}

}
