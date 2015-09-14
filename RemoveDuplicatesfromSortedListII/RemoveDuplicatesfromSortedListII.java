public class RemoveDuplicatesfromSortedListII{
	public static void main(String args[]){
	// Test case
	ListNode ln1 = new ListNode(1);
	ListNode ln2 = new ListNode(1);
	ListNode ln3 = new ListNode(2);
	ListNode ln4 = new ListNode(3);
	ListNode ln5 = new ListNode(4);
	ListNode ln6 = new ListNode(4);
	ListNode root = ln1;
	ln1.next = ln2;
	ln2.next = ln3;
	ln3.next = ln4;
	ln4.next = ln5;
	ln5.next = ln6;
	
	// Main algorithm
	ListNode dummy = new ListNode(0);
	dummy.next = root;
	ListNode curNode = dummy;
	int curVal = 0;
	while(curNode.next != null && curNode.next.next != null){
		if(curNode.next.val == curNode.next.next.val){
			curVal = curNode.next.val;
			while(curNode.next.next != null && curVal == curNode.next.val){
				curNode.next = curNode.next.next;
			}
			if(curNode.next.next == null && curVal == curNode.next.val){
				curNode.next = null;
			}
		}else{
			curNode = curNode.next;
		}
	}
	
	
	
	// Output
	ListNode head = dummy.next;
	while(head != null){
		System.out.print(head.val + "->");
		head = head.next;
	}
	System.out.println("");
	}
}