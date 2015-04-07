package leetcode;

public class ZigZagConversion {

	public String convert(String s, int nRows) {

		if (nRows <= 1)
			return s;
		StringBuffer result = new StringBuffer("");
		if (s.length() == 0)
			return s;
		int zigSize = nRows * 2 - 2;
		for (int i = 0; i < nRows; i++) {
			for (int base = i;; base += zigSize) {
				if (base >= s.length())
					break;
				result.append(s.charAt(base));
				if (i > 0 && i < nRows - 1) {
					// middle need add ziggggging char
					int ti = base + zigSize - 2 * i;
					if (ti < s.length())
						result.append(s.charAt(ti));
				}
			}
		}

		return result.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
