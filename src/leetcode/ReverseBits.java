package leetcode;

public class ReverseBits {

	public int reverseBits(int n) {
		for (int i = 0; i < 16; i++) {
			n = swapBits(n, i, 32 - i - 1);
		}
		return n;
	}

	private int swapBits(int n, int i, int j) {
		// TODO Auto-generated method stub
		int a = (n >> i) & 1;
		int b = (n >> j) & 1;
		if ((a ^ b) != 0) {
			return n ^= (1 << i) | (1 << j);
		}

		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
