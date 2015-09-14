public class RootLeafNumAns{
    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode root, int prev){
        if(root == null) {
            return 0;
        }

        int sum = root.val + prev * 10;
        if(root.left == null && root.right == null) {
            return sum;
        }

        return dfs(root.left, sum) + dfs(root.right, sum);
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
		
		System.out.println(sumNumbers(root));
	}
	
}