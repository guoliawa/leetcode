package leetcode;

import java.util.LinkedList;

public class MinimumDepthofBinaryTree {

	public static int minDepth_recursive(TreeNode root) {
		if (root == null)
			return 0;

		int minleft = minDepth_recursive(root.left);
		int minright = minDepth_recursive(root.right);

		if (minleft == 0 || minright == 0) {
			return minleft >= minright ? minleft + 1 : minright + 1;
		}

		return Math.min(minleft, minright) + 1;
	}

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;

		int depth = 1;

		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		int curnum = 1;
		int nextnum = 0;

		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			curnum--;

			if (cur.left == null && cur.right == null) {
				return depth;
			}

			if (cur.left != null) {
				queue.add(cur.left);
				nextnum++;
			}

			if (cur.right != null) {
				queue.add(cur.right);
				nextnum++;
			}

			if (curnum == 0) {
				curnum = nextnum;
				nextnum = 0;
				depth++;
			}

		}
		return depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
