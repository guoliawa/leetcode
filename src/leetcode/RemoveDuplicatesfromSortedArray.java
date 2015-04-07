package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
	
    public static int removeDuplicates(int[] A) {
        if (A.length < 2) return A.length;
        
        int j = 0, i = 1;
        
        while ( i < A.length ) {
        	if (A[i] == A[j]) {
        		i ++;
        	} else {
        		j ++;
        		A[j] = A[i];
        		i ++;
        	}
        }
        
        A = Arrays.copyOf(A, j + 1);
        return A.length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
