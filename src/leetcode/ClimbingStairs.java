package leetcode;

public class ClimbingStairs {
	// http://blog.csdn.net/kenden23/article/details/17377869
	
    public int climbStairs(int n) {
    	// http://www.cnblogs.com/springfor/p/3886576.html
    	// Dp[n] = Dp[n-1] + Dp[n-2]
    	if (n == 0 || n == 1 || n == 2) return n;
    	int [] dp = new int[n+1];
    	dp[0] = 0;
    	dp[1] = 1;
    	dp[2] = 2;
    	
    	for (int i = 3; i < n + 1; i ++ ) {
    		dp[i] = dp[i-1] + dp[i-2];
    	}
    	
    	return dp[n];
     }
    
    public int climbStairsRecur(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairsRecur(n-1) + climbStairsRecur(n-2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
