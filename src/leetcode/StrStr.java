package leetcode;

public class StrStr {
	
    public int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        
        if (needleLen == haystackLen && needleLen == 0) return 0;
        if (needleLen == 0) return 0;
        
        for (int i = 0; i < haystackLen; i++) {
        	if (haystackLen - i + 1 < needleLen) return -1;
        	
        	int k = i;
        	int j = 0;
        	
        	while (j < needleLen && k < haystackLen && needle.charAt(j) == haystack.charAt(k)) {
        		j++;
        		k++;
        		if (j == needleLen) {
        			return i;
        		}
        	} 
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
