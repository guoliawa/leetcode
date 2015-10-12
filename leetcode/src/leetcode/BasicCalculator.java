package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class BasicCalculator {
	public static int calculate(String s) {
		int result = 0;

		if (s == null || s.length() == 0) {
			return result;
		}

		// delte white spaces
		s = s.replaceAll(" ", "");

        Stack stack = new Stack();
		char[] arr = s.toCharArray();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				continue;
			}

			if (arr[i] >= '0' && arr[i] <= '9') {
				sb.append(arr[i]);

				if (i == arr.length - 1) {
					stack.push(sb.toString());
				}
			} else {
				if (sb.length() > 0) {
					stack.push(sb.toString());
					sb = new StringBuilder();
				}

				if (arr[i] != ')') {
					stack.push(new String(new char[] { arr[i] }));
				} else {
					// when meet ')', pop and calculate
					ArrayList t = new ArrayList();
					while (!stack.isEmpty()) {
						String top = (String) stack.pop();
						if (top.equals("(")) {
							break;
						} else {
							t.add(0, top);
						}
					}

					int temp = 0;
					if (t.size() == 1) {
						temp = Integer.valueOf((String) t.get(0)).intValue();
					} else {
						for (int j = t.size() - 1; j > 0; j = j - 2) {
							if (t.get(j - 1).equals("-")) {
								temp += 0 - Integer.valueOf((String) t.get(j))
										.intValue();
							} else {
								temp += Integer.valueOf((String) t.get(j))
										.intValue();
							}
						}
						temp += Integer.valueOf((String) t.get(0)).intValue();
					}
					stack.push(String.valueOf(temp));
				}

			}

		}

		ArrayList t = new ArrayList();
		while (!stack.isEmpty()) {
			String elem = (String) stack.pop();
			t.add(0, elem);
		}

		int temp = 0;
		for (int i = t.size() - 1; i > 0; i = i - 2) {
			if (t.get(i - 1).equals("-")) {
				temp += 0 - Integer.valueOf((String) t.get(i)).intValue();
			} else {
				temp += Integer.valueOf((String) t.get(i)).intValue();
			}
		}
		temp += Integer.valueOf((String) t.get(0)).intValue();
		result = temp;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
