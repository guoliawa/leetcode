package leetcode;

public class ExcelSheetColumnNumber {
	
    public static int titleToNumber(String s) {
        int result = 0;
    	if ( s==null ) return result;
    	
    	int n = s.length();
    	for (int i = 0; i < n; i++) {
    		char ch = s.charAt(i);
    		result = result * 26 + (ch - 'A' + 1);
    	}
    	
    	return result;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int result = titleToNumber("ABB");
        Util.print("result is " + result);
	}
}
