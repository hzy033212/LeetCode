public class MinDepthBinary{
	
	public static int findMin(TreeNode root){
		if(root.right == null && root.left == null){
			return 1;
		}
		if(root.right != null && root.left == null){
			return findMin(root.right) + 1;
		}
		if(root.right == null && root.left != null){
			return findMin(root.left) + 1;
		}
		return Math.min(findMin(root.right), findMin(root.left)) + 1;
	}
	
	public static void main(String args[]){
		//Test case
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn7 = new TreeNode(7);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		tn3.right = tn6;
		tn6.left = tn7;
		TreeNode root = tn1;
		
		//Main Algorithm
		int minLevel = findMin(root);
		
		
		//Output
		System.out.println(minLevel);
		
	}
}