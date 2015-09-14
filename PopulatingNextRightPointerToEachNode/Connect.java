import java.util.*;

public class Connect{
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
		tln2.left = tln4; tln2.right = tln5;
		tln3.left = tln6; tln3.right = tln7;
		TreeLinkNode root = tln1;
		
		// Main Algorithm
		if(root == null){
			System.out.println("No tree existed!");
		}
		
		// DFS for binary tree
		
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		Queue<TreeLinkNode> queueCopy = new LinkedList<TreeLinkNode>();
		queue.add(root);
		TreeLinkNode temp = null;
		while(!queue.isEmpty()){
			temp = queue.poll();
			queueCopy.add(temp);
			// System.out.println(temp.val);
			if(temp.left != null){
				queue.add(temp.left);
				temp.left.next = temp.right;
			}
			if(temp.right != null){
				queue.add(temp.right);
			}
		}
		
		//TreeLinkNode output = null;
		//int size = queueCopy.size();
		//for(int q = 0; q < size; q++){
			// output = queueCopy.element();
			// System.out.println(output.val);
		//}
		
		int count = 2;
		TreeLinkNode temp2 = null;
		TreeLinkNode temp3 = null;
		queueCopy.poll();
		while(!queueCopy.isEmpty()){
			for(int a = 0; a < count-1; a++){
				temp2 = queueCopy.poll();
				if(!queueCopy.isEmpty()){
					temp3 = queueCopy.element();
					temp2.next = temp3;
				}
			}
			count *= 2;
		}
		
		
		
		
		//Test result
		System.out.println(root.left.next.val); // 3
		System.out.println(root.left.left.next.next.next.val); // 7
	}
}