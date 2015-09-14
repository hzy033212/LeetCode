import java.util.*;

public class PathSumAns{

	public static boolean dfs(TreeNode root, int sum){
		if(root == null){
			return false;
		}
		if(root.left == null && root.right == null){
			return sum == root.val;
		}
		return dfs(root.left, sum-root.val) || dfs(root.right, sum-root.val);
	}
	
	public static void main(String args[]){
		// Test Set
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
		tn5.left = tn6;
		tn5.right = tn7;
		TreeNode root = tn1;
		
		// Main Algorithm
		int test = 8;
		boolean result = dfs(root, 15);
		System.out.println("Result is " + result);
	}
}