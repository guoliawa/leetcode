package leetcode;

public class ReverseInteger {
	
    public static int reverse(int x) {
    	// http://blog.csdn.net/linhuanmars/article/details/20024837
        if(x == Integer.MIN_VALUE) return 0;
        
        int num = Math.abs(x);
        int result = 0;
        while (num != 0) {
        	if (result > (Integer.MAX_VALUE - num % 10) / 10) 
        		return 0;
        	result = result*10 + num % 10;
        	num = num/10;
        }
        
        result = x > 0 ? result : -result;
        
        return result;
    }
	
	public static int reverse_Efficient (int x) {
		// 1534236469 will fail in leetcode, cannot handle big data
		boolean flag = false;
		if (x < 0) {
			x = 0 - x;
			flag = true;
		}
		
		int result = 0;
		int p = x;
		
		while (p > 0) {
			int mod = p % 10;
			p = p / 10;
			result = result * 10 + mod;
		}
		
		if (flag) {
			result = 0 - result;
		}
		
		return result;
	}
	
    public static int reverse_simple(int x) {
    	// 1534236469 will fail in leetcode, cannot handle big data
        int result = 0;
        
        while (x != 0) {
        	result = result*10 + x%10;
        	x = x/10;
        }
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util.print("The result is " + reverse(1534236469)); 
	}

}
