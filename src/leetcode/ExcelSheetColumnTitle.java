package leetcode;

public class ExcelSheetColumnTitle {
	
    public static String convertToTitle(int n) {
        StringBuilder  tempStringBuilder = new StringBuilder();
                
        while (n > 0) {
        	n --;
        	char tempChar = (char) ('A' + (n % 26));
        	tempStringBuilder.append(tempChar);
        	n = n/26;
        }
        
        tempStringBuilder.reverse();
        
        return tempStringBuilder.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = convertToTitle(28);
        Util.print("result is " + result);
	}

}
