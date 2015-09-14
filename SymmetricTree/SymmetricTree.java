public class SymmetricTree{

	public static boolean IsSym(TreeNode rootLeft, TreeNode rootRight){
		if(rootLeft == null && rootRight == null){
			return true;
		}
		if(rootLeft == null || rootRight == null){
			return false;
		}
		
		return rootLeft.val == rootRight.val && IsSym(rootLeft.left, rootRight.right) && IsSym(rootLeft.right, rootRight.left);
	}

	public static void main(String args[]){
		//Test case
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(2);
		TreeNode tn4 = new TreeNode(3);
		TreeNode tn5 = new TreeNode(4);
		TreeNode tn6 = new TreeNode(4);
		TreeNode tn7 = new TreeNode(3);
		TreeNode root = tn1;
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.right = tn4;
		//tn2.right = tn5;
		//tn3.left = tn6;
		tn3.right = tn7;
		
		
		//Main algorithm
		boolean isSym;
		if(root == null){
			isSym = true;
		}else{
			isSym = IsSym(root.left, root.right);
		}
		
		
		//Output
		System.out.println(isSym);
		
	}
}