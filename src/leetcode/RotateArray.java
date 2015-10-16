package leetcode;

public class RotateArray {
	
	
	public void reverse(int[] nums, int begin, int end) {
		int tmp;
		while (begin < end) {
			tmp = nums[begin];
			nums[begin] = nums[end];
			nums[end] = tmp;
			begin ++;
			end --;
		}
	}

    public void rotate(int[] nums, int k) {
    	k = k % nums.length;
    	
		if (k >= nums.length)
			return;
		else {
			int i = nums.length - k;
			reverse(nums, 0, i - 1);
			reverse(nums, i, nums.length - 1);
			reverse(nums, 0, nums.length - 1);
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testNums = { 1, 2 };
		RotateArray ra = new RotateArray();
		ra.rotate(testNums, 3);
		for (int num : testNums) {
			System.out.println(num);
		}
	}

}
