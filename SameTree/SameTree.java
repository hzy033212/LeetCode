public class SameTree{

	public static boolean IsSame(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1.left == null && root1.right == null && root2.left == null && root2.right == null && root1.val == root2.val){
			return true;
		}
		if(root1.left != null && root1.right == null && root2.left != null && root2.right == null && root1.val == root2.val){
			return true && IsSame(root1.left, root2.left);
		}
		if(root1.left == null && root1.right != null && root2.left == null && root2.right != null && root1.val == root2.val){
			return true && IsSame(root1.right, root2.right);
		}
		if(root1.left != null && root1.right != null && root2.left != null && root2.right != null && root1.val == root2.val){
			return true && IsSame(root1.left, root2.left) && IsSame(root1.right, root2.right);
		}
		
		return false;
	}

	public static void main(String args[]){
		//Test Case 1
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn7 = new TreeNode(7);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn7;
		TreeNode root1 = tn1;
		
		//Test Case 2
		TreeNode tn4 = new TreeNode(1);
		TreeNode tn5 = new TreeNode(2);
		TreeNode tn6 = new TreeNode(3);
		TreeNode tn8 = new TreeNode(7);
		tn4.left = tn5;
		tn4.right = tn6;
		tn5.left = tn8;
		TreeNode root2 = tn4;
		
		//Main Algorithm
		boolean isSame = IsSame(root1, root2);
		
		
		//Output
		System.out.println(isSame);
		
	}
}