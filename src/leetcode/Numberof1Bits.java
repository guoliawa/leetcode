package leetcode;

public class Numberof1Bits {

    public static int hammingWeight(int n) {
    	// Leetcode doesn't accept this answer, time limit.
        int result = 0;
        while (n != 0) {
        	if ((n & 1) != 0) {
        		result ++;
        	}       	
        	n >>= 1;
        }        
        return result;
    }
    
    public static int hammingWeight_solution2(int n) {
    	// Leetcode accept this answer
        int result = 0;
        while (n != 0) {
            result++;
            n = (n - 1) & n;
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		/*
		 * http://www.51itong.net/leetcode-number-of-1-bits-9513.html 
		 */
		hammingWeight(5);
	}

}
