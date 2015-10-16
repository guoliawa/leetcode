package leetcode;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int nonZeroIndex = 0;
        int size = nums.length;

        while (zeroIndex < size && nonZeroIndex < size) {
            while (zeroIndex < size && nums[zeroIndex] != 0)
                zeroIndex++;
            while (nonZeroIndex < size
                    && (nums[nonZeroIndex] == 0 || nonZeroIndex < zeroIndex))
                nonZeroIndex++;

            // swap the value
            if (zeroIndex < size && nonZeroIndex < size) {
                nums[zeroIndex++] = nums[nonZeroIndex];
                nums[nonZeroIndex++] = 0;
            }
        }
    }

    public static void main(String[] args) {

    }

}
