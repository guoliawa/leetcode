package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (numRows == 0) {
    		return res;
    	}
    	
    	for (int i = 0; i < numRows; i++) {
    		List<Integer> row = new ArrayList<Integer>();
    		row.add(1);
    		for (int j=1; j<i; j++) {
    			List<Integer> prevRow = res.get(i-1);
    			int temp = prevRow.get(j-1) + prevRow.get(j);
    			row.add(temp);
    		}
    		if (i != 0) {
    			row.add(1);
    		}
    		res.add(row);
    	}    	
    	return res;
    }
	
	
	public static void main(String[] args) {
		/*
		 * Refer to http://www.cnblogs.com/springfor/p/3887910.html 
		 */
		generate(5);
	}

}
