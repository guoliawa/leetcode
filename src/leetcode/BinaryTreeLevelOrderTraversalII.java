package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int currLevelNodeNum = 1;
        int nextLevelNodeNum = 0;

        while (currLevelNodeNum != 0) {
            ArrayList<Integer> currLevelResult = new ArrayList<Integer>();
            nextLevelNodeNum = 0;

            while (currLevelNodeNum != 0) {
                TreeNode node = queue.poll();

                currLevelNodeNum--;
                currLevelResult.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                    nextLevelNodeNum++;
                }

                if (node.right != null) {
                    queue.offer(node.right);
                    nextLevelNodeNum++;
                }
            }

            result.add(0, currLevelResult);
            currLevelNodeNum = nextLevelNodeNum;
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
