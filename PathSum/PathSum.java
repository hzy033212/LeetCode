import java.util.*;

public class PathSum{

	public static int dfs(TreeNode root, int sum){
		//ArrayList<Integer> result = new ArrayList<Integer>();
		if(root.left == null && root.right == null){
			return 10*sum + root.val;
			//result.add(sum);
		}
		if(root.left != null && root.right == null){
			return dfs(root.left, 10*sum+root.val);
		}
		if(root.right != null && root.left == null){
			return dfs(root.right, 10*sum+root.val);
		}
		//if(root.left != null && root.right != null){
			return dfs(root.left, 10*sum+root.val)+dfs(root.right, 10*sum+root.val);
		//}
		//for(int i = 0; i < result.size(); i++){
			//System.out.print( result.get(i) + "->");
		//}
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
		//tn2.left = tn4;
		//tn2.right = tn5;
		//tn5.left = tn6;
		//tn5.right = tn7;
		TreeNode root = tn1;
		
		// Main Algorithm
		//int test = 8;
		// ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println(dfs(root, 0));
		//for(int i = 0; i < result.size(); i++){
		//	System.out.print( result.get(i) + "->");
		//	result = result.next;
		//}
		
	}
}