package leetcode;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int [] result = {-1, -1};
        if (numbers.length <= 2) {
            return result;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(target - numbers[i]) != null && map.get(target - numbers[i]) != (i+1)) {
                result[0] = Math.min(i+1, map.get(target - numbers[i]));
                result[1] = Math.max(i+1, map.get(target - numbers[i]));;
                return result;
            }
            map.put(numbers[i], i+1);
        }
        
        return result;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] testcase_1 = {0,4,3,0};
        int target1 = 0;
        twoSum(testcase_1, target1);
	}

}
