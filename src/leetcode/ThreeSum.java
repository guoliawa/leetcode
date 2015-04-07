package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	// http://www.programcreek.com/2012/12/leetcode-3sum/
	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (num.length < 3)
			return result;
		Arrays.sort(num);

		for (int i = 0; i < num.length - 2; i++) {
			// avoid duplicate solutions
			if (i == 0 || num[i] > num[i - 1]) {
				int negate = -num[i];

				int start = i + 1;
				int end = num.length - 1;

				while (start < end) {
					if (num[start] + num[end] == negate) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);

						result.add(temp);
						start++;
						end--;

						while (start < end && num[end] == num[end + 1])
							end--;
						while (start < end && num[start] == num[start - 1])
							start++;
					} else if (num[start] + num[end] < negate) {
						start++;
					} else {
						end--;
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
