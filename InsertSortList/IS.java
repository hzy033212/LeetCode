public class IS{
	public static void main(String args[]){
		// Test example
		ListNode ln5 = new ListNode(5);
		ListNode ln4 = new ListNode(4);
		ListNode ln3 = new ListNode(2);
		ListNode ln2 = new ListNode(3);
		ListNode ln1 = new ListNode(1);
		ln5.next = ln4;
		ln4.next = ln3;
		ln3.next = ln2;
		ln2.next = ln1;
		ListNode cur1 = ln5;
		for (int i = 0; i < 5; i++){
			System.out.print( cur1.val + "->");
			cur1 = cur1.next;
		}
		System.out.println("");
		ListNode head = ln5;
		
		// Main algorithm
		ListNode dummy = new ListNode(0); // dummy act as the head of new list and do not compare with other nodes.
		ListNode temp = null; // temp used to store ready to cut link of head.next.
		ListNode node = dummy; // node used to search all new link to find proper position for new node to be added in.
		while(head != null){ // Still some nodes left to add to new list.
			node = dummy; // node has to go back to the beginning of new list.
			while(node.next != null && node.next.val < head.val){
				node = node.next;
			}
			temp = head.next;
			head.next = node.next; 
			node.next = head; // This and previous statement used to insert head to a proper position. 
			head = temp; // head to its next position.
		}
		
		// Test result
		ListNode cur2 = dummy.next;
		for (int i = 0; i < 5; i++){
			System.out.print( cur2.val + "->");
			cur2 = cur2.next;
		}
		System.out.println("");
	}
}