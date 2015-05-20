package leetcode;

public class tree {
    //	 {1,2,3,#,#,4,#,#,5}
	public static TreeNode constructTree(String [] nums) {
		if (nums.length == 0 && nums[0].equals("#")) return null;
		TreeNode root = new TreeNode(Integer.parseInt(nums[0]));
		
		for (int i = 1; i < nums.length; i ++) {
			addTotree(root, nums[i]);    		
		}		
		
		return root;
	}
	
	

	private static void addTotree(TreeNode root, String string) {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
