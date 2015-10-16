package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PascalTriangleII {
	
    public static List<Integer> getRow(int rowIndex) {
    	// Arraylist 初始化 容量是没有用的。。。
        List<Integer> res = new ArrayList<Integer>(rowIndex + 1);
        for (int i = 0; i <= rowIndex + 1; i ++) {
        	res.add(0);
        }
        
        res.set(0, 1);
               
    	for (int i = 1; i <= rowIndex; i++) {
    		res.set(i, 1);
    		for (int j = i - 1; j > 0; j --) {
                res.set(j,  res.get(j) + res.get(j - 1));
    		}
    	}

    	for (Iterator<Integer> iter = res.iterator(); iter.hasNext(); ) {	
    		if ( (Integer)iter.next() == 0) iter.remove();    		
    	}
    	
    	return res;        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Util.print("The result is: " + getRow(0));
	}

}
