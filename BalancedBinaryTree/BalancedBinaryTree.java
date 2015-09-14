public class BalancedBinaryTree{

	public static boolean IsBalance(TreeNode root){
		if(root == null){
			return true;
		}
		if(root.left == null && root.right == null){
			return true;
		}
		if(root.left != null && root.right != null){
			return IsBalance(root.left) && IsBalance(root.right);
		}
		if(root.left != null && root.right == null){
			if(root.left.left != null || root.left.right != null){
				return false;
			}else{
				return true;
			}
		}
		if(root.left == null && root.right != null){
			if(root.right.left != null || root.right.right != null){
				return false;
			}else{
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]){
		//Test case
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		TreeNode root = tn1;
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn3.left = tn5;
		tn5.right = tn6;
		
		//Main algorithm
		boolean isBalance = IsBalance(root);
		
		
		//Output
		System.out.println(isBalance);
		
	}
}