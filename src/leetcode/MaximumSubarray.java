package leetcode;

public class MaximumSubarray {

	// http://www.programcreek.com/2013/02/leetcode-maximum-subarray-java/

	public int maxSubArray(int[] A) {
		int newsum = A[0];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			newsum = Math.max(newsum + A[i], A[i]);
			max = Math.max(max, newsum);
		}
		return max;
	}
	
//	 Dynamic Programming Solution :
//	 The changing condition for dynamic programming is "We should ignore the sum of the previous n-1 elements if nth element is greater than the sum."
	
	public int maxSubArray_DM(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
 
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
