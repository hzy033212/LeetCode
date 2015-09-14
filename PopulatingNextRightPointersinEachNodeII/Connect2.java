import java.util.*;

public class Connect2{
	public static void main(String args[]){
		
		//Test Set
		TreeLinkNode tln1 = new TreeLinkNode(1);
		TreeLinkNode tln2 = new TreeLinkNode(2);
		TreeLinkNode tln3 = new TreeLinkNode(3);
		TreeLinkNode tln4 = new TreeLinkNode(4);
		TreeLinkNode tln5 = new TreeLinkNode(5);
		TreeLinkNode tln6 = new TreeLinkNode(6);
		TreeLinkNode tln7 = new TreeLinkNode(7);
		tln1.left = tln2; tln1.right = tln3;
		tln2.left = tln4; 
		// tln2.right = tln5;
		//tln3.left = tln6; 
		tln3.right = tln7;
		TreeLinkNode root = tln1;
		
		// Main Algorithm
		if(root == null){
			System.out.println("No tree existed!");
		}
		
		// constant memory usage
		TreeLinkNode parent = root;
		TreeLinkNode prev = null;
		TreeLinkNode next = null;
		while(parent != null){
			
			prev = null;
			next = null;
			if(parent.left != null){
				next = parent.left;
			}else if(parent.right != null){
				next = parent.right;
			}// 保存下一个While循环的初始状况
			
			while(parent != null){
				if(parent.left != null){
					if(prev == null){
						prev = parent.left;
					}else{
						prev.next = parent.left;
						prev = prev.next;
					}
				}// 如果左子树不为空，prev连上左子树。
			
				if(parent.right != null){
					if(prev == null){
						prev = parent.right;
					}else{
						prev.next = parent.right;
						prev = prev.next;
					}
				}// 如果右子树不为空， prev连上右子树。
				parent = parent.next;
			}
			
			parent = next;
		}
	
		
		
		
		
		//Test result
		System.out.println(root.left.next.val); // 3
		System.out.println(root.left.left.next.val); // 7
	}
}