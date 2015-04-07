package leetcode;

import java.util.LinkedList;

public class PathSum {
	
    public static boolean hasPathSum(TreeNode root, int sum) {
        boolean result = false;
        if (root == null) return result;
        
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> values = new LinkedList<Integer>();
        
        nodes.add(root);
        values.add(root.val);
        
        while (!nodes.isEmpty()) {
        	TreeNode curr = nodes.poll();
        	int sumValue = values.poll();
        	
        	if (curr.left == null && curr.right == null && sumValue == sum) {
        		return true;
        	}
        	
        	if (curr.left != null) {
        		nodes.add(curr.left);
        		values.add(sumValue + curr.left.val);
        	}
        	
        	if (curr.right != null) {
        		nodes.add(curr.right);
        		values.add(sumValue + curr.right.val);
        	}
        	
        }
          
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
