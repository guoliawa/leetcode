package leetcode;

import java.util.HashMap;

public class SingleNumber {
	/*
	 * http://www.cnblogs.com/springfor/p/3870801.html
	 * 这道题运用位运算的异或。异或是相同为0，不同为1。所以对所有数进行异或，得出的那个数就是single
	 * number。初始时先让一个数与0异或，然后再对剩下读数挨个进行异或。 这里运用到异或的性质：对于任何数x，都有x^x=0，x^0=x
	 * 同时异或还有性质：
	 * 
	 * 交换律 A XOR B = B XOR A
	 * 
	 * 结合律 A XOR B XOR C = A XOR (B XOR C) = (A XOR B) XOR C
	 * 
	 * 自反性 A XOR B XOR B = A XOR 0 = A
	 */
	public int singleNumber(int[] A) {

		for (int i = 1; i < A.length; i++) {
			A[i] ^= A[i - 1];
		}

		return A[A.length - 1];
	}

	public int singleNumberII(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			Integer val = map.get(A[i]);
			if (val != null) {
				map.put(A[i], val + 1);
			} else {
				map.put(A[i], 1);
			}
		}

		for (Integer key : map.keySet()) {
			if (map.get(key) != 3) {
				return key;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
