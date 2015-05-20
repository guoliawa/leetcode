package leetcode;

public class ValidateBinarySearchTree {
	// http://www.cnblogs.com/EdwardLiu/p/3980506.html
	public boolean isValidBST(TreeNode root) {
	    if (root == null) return true;
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
 
	public boolean validate(TreeNode root, long min, long max) {
		if (root == null) {
			return true;
		}
 
		// not in range
		if (root.val <= min || root.val >= max) {
			return false;
		}
 
		// left subtree must be < root.val && right subtree must be > root.val
		return validate(root.left, min, root.val) && validate(root.right, root.val, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
