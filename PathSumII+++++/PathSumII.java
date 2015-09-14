import java.util.*;

public class PathSumII{
	
	public static boolean check(TreeNode root, int sum){
		if(root == null){
			return false;
		}
		if(root.left == null && root.right == null){
			return sum == root.val;
		}
		return check(root.left, sum-root.val) || check(root.right, sum-root.val);
	}
	
	public static ArrayList<ArrayList <Integer>> dfs(TreeNode root, int sum, ArrayList<Integer> temp){
		ArrayList<ArrayList <Integer>> result = new ArrayList<ArrayList <Integer>>();
		if(root == null){
			return result;
		}
		if(root.left == null && root.right == null){
			if(sum == root.val){
				temp.add(root.val);
				System.out.println(temp);
				result.add(temp);
			}
		}
		if(root.left != null){
			if(check(root.left, sum-root.val)){
				temp.add(root.val);
			}else{
				temp = new ArrayList<Integer>();
			}
		}
		if(root.right != null){
			if(check(root.right, sum-root.val)){
				temp.add(root.val);
			}else{
				temp = new ArrayList<Integer>();
			}
		}
		
		return result;
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
		int test = 7;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<ArrayList <Integer>> result = dfs(root, test, temp);
		System.out.println("Result is " + result);
	}
}