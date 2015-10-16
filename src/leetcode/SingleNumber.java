package leetcode;

import java.util.HashMap;

public class SingleNumber {
	/*
	 * http://www.cnblogs.com/springfor/p/3870801.html
	 * ���������λ���������������ͬΪ0����ͬΪ1�����Զ�������������򣬵ó����Ǹ�������single
	 * number����ʼʱ����һ������0���Ȼ���ٶ�ʣ�¶�������������� �������õ��������ʣ������κ���x������x^x=0��x^0=x
	 * ͬʱ��������ʣ�
	 * 
	 * ������ A XOR B = B XOR A
	 * 
	 * ����� A XOR B XOR C = A XOR (B XOR C) = (A XOR B) XOR C
	 * 
	 * �Է��� A XOR B XOR B = A XOR 0 = A
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
