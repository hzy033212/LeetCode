public class RootLeafNum{

	public static int dfs(TreeNode root, int prev){
		if(root == null){
			return 0;
		}
		prev = 10*prev + root.val;
		if(root.left == null && root.right == null){
			return prev;
		}
		return dfs(root.left, prev)+dfs(root.right, prev);
	}

	public static void main(String args[]){
		// Test Set
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		TreeNode root = tn1;
		
		//Main Algorithm
		int result = 0;
		result = dfs(root, 0);
		
		
		System.out.println(result);
	}
}