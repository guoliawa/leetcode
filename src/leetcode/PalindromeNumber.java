package leetcode;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
	
		int div = 1;

		while (x / div >= 10) {
			div = div * 10;
		}

		while (x > 0) {
			int l = x / div;
			int r = x % 10;
			
			if (l != r)
				return false;
			x = x % div; // cut the highest bit, ie, 12321 % 10000 = 2321
			x = x / 10; // cut the lowest bit, ie, 2321 / 10 = 232
			div = div / 100;
		}

		return true;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util.print("The result is : " + isPalindrome(100));
		Util.print("The result is : " + isPalindrome(121));
		Util.print("The result is : " + isPalindrome(0));
	}

}
