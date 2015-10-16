package leetcode;

public class RemoveElement {
	
    public int removeElement(int[] A, int elem) {
        int idx_new = 0;
        int idx_old = 0;
        if (A.length == 0) return 0;
        while (idx_old < A.length) {
        	if (A[idx_old] != elem) {
        		A[idx_new] = A[idx_old];
        		idx_new++;
        	}
        	idx_old++;
        }
        
        return idx_new;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
