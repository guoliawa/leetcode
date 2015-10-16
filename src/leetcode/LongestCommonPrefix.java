package leetcode;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
    	// http://www.cnblogs.com/springfor/p/3872316.html
        String result = "";
        if (strs.length == 0 || strs == null) return result;
        
        for (int i = 0; i < strs[0].length(); i ++) {
        	char x = strs[0].charAt(i);
        	for (int j = 1; j < strs.length; j++) {
        		if (strs[j].length() == i || strs[j].charAt(i) != x) {
        			return strs[0].substring(0, i);
        		}
        	}
        }
        
        return strs[0];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
