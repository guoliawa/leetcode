package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees {
	
    public int numTrees(int n) {
        int [] N = new int [n + 1];
        N[0] = 1;
        for (int i = 1; i <= n; i++) {
        	for (int j = 0; j < i; j++) {
        		N[i] += N[j] * N[i - j - 1];
        	}
        }
        return N[n];
    }
    
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
	
    public List<TreeNode> generateTrees(int start, int end) {
    	List<TreeNode> list = new ArrayList<TreeNode>();
    	if (start > end) {
    		list.add(null);
    		return list;
    	}
    	
    	for (int i = start; i <= end; i++) {
    		List<TreeNode> lefts = generateTrees(start, i - 1);
    		List<TreeNode> rights = generateTrees(i+1, end);
    		for (TreeNode left : lefts) {
    			for (TreeNode right : rights) {
    				TreeNode node = new TreeNode(i);
    				node.left = left;
    				node.right = right;
    				list.add(node);
    			}
    		}
    	}
    	return list;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
