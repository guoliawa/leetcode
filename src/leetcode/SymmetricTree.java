package leetcode;

public class SymmetricTree {
	// http://www.cnblogs.com/TenosDoIt/p/3440729.html
	public static boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;

		return isSymmetricTree(root.left, root.right);
	}

	public static boolean isSymmetricTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		return (p.val == q.val) && isSymmetricTree(p.left, q.right)
				&& isSymmetricTree(p.right, q.left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
