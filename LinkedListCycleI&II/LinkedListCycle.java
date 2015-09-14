public class LinkedListCycle{
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
		ln5.next = ln3; // Cycle!
		ListNode head = ln1;
		
		// Main algorithm
		boolean cycle = false;
		ListNode slow = head;
		ListNode fast = head;
		if(head.next == null || head == null || head.next.next == null){
			cycle = false;
		}else{
			while(fast.next != null){
				fast = fast.next.next;
				slow = slow.next;
				if(fast == slow){
					cycle = true;
					break;
				}
			}
		}
		
		
		System.out.println("The answer is " + cycle);
		
	}
}