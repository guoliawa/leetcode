package leetcode;

public class TrappingRainWater {
	// http://www.lifeincode.net/programming/leetcode-trapping-rain-water-java/
	public static int trap(int[] A) {
		// special case
		if (A == null || A.length == 0)
			return 0;
		int[] maxLeft = new int[A.length];
		int[] maxRight = new int[A.length];
		int max = A[0];

		for (int i = 1; i < A.length; i++) {
			maxLeft[i] = max;
			if (A[i] > max) {
				max = A[i];
			}
		}

		max = A[A.length - 1];
		for (int i = A.length - 2; i >= 0; i--) {
			maxRight[i] = max;
			if (A[i] > max) {
				max = A[i];
			}
		}

		int ret = 0;
		for (int i = 0; i < A.length - 1; i++) {
			int trap = Math.min(maxLeft[i], maxRight[i]) - A[i];
			if (trap > 0)
				ret += trap;
		}

		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		Util.print("The result is:" + trap(A));
	}

}
