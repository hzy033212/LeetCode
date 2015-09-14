public class MaxDepthTree{

	public static int MaxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		int left = MaxDepth(root.left);
		int right = MaxDepth(root.right);
		
		return Math.max(left, right)+1; // Note that it is here to add 1!
	}
	
	public static void DFS(TreeNode root){
		if(root == null){
			System.out.print("");
		}else{
			// System.out.println(root.val);
			DFS(root.left);
			// System.out.println(root.val);
			DFS(root.right);
			System.out.println(root.val);
		}
	}

	public static void main(String args[]){
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn7 = new TreeNode(7);
		TreeNode tn8 = new TreeNode(8);
		TreeNode tn9 = new TreeNode(9);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		tn3.left = tn6;
		tn3.right = tn7;
		tn4.left = tn8;
		tn4.right = tn9;
		TreeNode root = tn1;
		
		// Main algorithm
		int maxDepth = 0;
		maxDepth = MaxDepth(root);
		// DFS(root);
		
		System.out.println("Maximum depth of this binary tree is " + maxDepth);
		
	}
}