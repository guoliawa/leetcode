package leetcode;

public class ValidPalindrome {
	
	public static boolean isValid(char ch) {
		if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
			return true;
		return false;
	}
	
    public static boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        s = s.toLowerCase();
        int length = s.length();
        int left = 0; 
        int right = length - 1;
        while (left < right) {
        	while (!isValid(s.charAt(left))) {
        		left ++;
        		if (left >= right) return true;
        	}
        	
        	while (!isValid(s.charAt(right))) {
        		right --;
        		if (left >= right) return true;
        	}
        	
        	if (s.charAt(left) != s.charAt(right)) return false;
        	left ++;
        	right --;
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
