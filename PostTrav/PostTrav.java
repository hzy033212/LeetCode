public class PostTrav{

	public static void trav(TreeNode cur){
	// Recursive format
		if(cur.left != null){
			trav(cur.left);
		}
		if(cur.right != null){
			trav(cur.right);
		}
		System.out.println(cur.val);
	}

	public static void main(String args[]){
	
		// Make a new test tree
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
		tn5.right = tn7;
		tn3.right = tn6;
		tn4.left = null;
		tn4.right = null;
		tn5.left = null;
		tn3.left = null;
		tn6.left = null;
		tn6.right = null;
		
		// PostTraverse search
		trav(tn1);
		
	}
}