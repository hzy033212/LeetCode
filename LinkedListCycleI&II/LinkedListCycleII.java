public class LinkedListCycleII{
	public static void main(String args[]){
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln4; // Cycle!
		ListNode head = ln1;
		
		// Main algorithm
		// Suppose this linked list is a loop!
		ListNode fast = head;
		ListNode slow = head;
		do{
			fast = fast.next.next;
			slow = slow.next;
		}while(fast != slow);
		while(head != slow){
			head = head.next;
			slow = slow.next;
		}
		
		System.out.println(head.val);
		
		
/*		// The following code is to reverse a linked list.
		ListNode before = head;
		while(before != null){
			System.out.print( before.val + "->");
			before = before.next;
		}
		System.out.println("");
		
		// List reverse
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = head.next;
		head.next = null;
		ListNode temp = null;
		ListNode temp2 = null;
		while(cur != null){
			temp2 = cur.next;
			temp = dummy.next;
			dummy.next = cur;
			cur.next = temp;
			cur = temp2;
		}
		ListNode go = dummy.next;
		while(go != null){
			System.out.print( go.val + "->");
			go = go.next;
		}
		System.out.println(""); */
		
	}
}