public class BalancedBinaryAns{

	public static int TestDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		
		int left = TestDepth(root.left);
		int right = TestDepth(root.right);
		
		if(left == -1 || right == -1 || Math.abs(left - right) > 1 ){
			return -1;
		}
		
		return Math.max(left, right) + 1;
		
	}
	
	public static boolean IsBalance(TreeNode root){
		if(TestDepth(root) != -1){
			return true;
		}else{
			return false;
		}
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