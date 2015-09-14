public class MergeTwoSortedLists{
	public static void main(String args[]){
		//Test Set
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ListNode ln6 = new ListNode(6);
		ListNode ln7 = new ListNode(7);
		ListNode ln8 = new ListNode(8);
		ListNode l1 = ln1;
		ListNode l2 = ln2;
		ln1.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln2.next = ln8;
		ln6.next = ln7;
		
		//Main algorithm
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		while(l1 != null && l2 != null){
			if(l1.val <= l2.val){
				cur.next = l1;
				l1 = l1.next;
				cur.next.next = null;
				cur = cur.next;
			}else{
				cur.next = l2;
				l2 = l2.next;
				cur.next.next = null;
				cur = cur.next;
			}
		}
		if(l1 == null && l2 != null){
			cur.next = l2;
		}
		if(l1 != null && l2 == null){
			cur.next = l1;
		}
		
		
		//Output
		ListNode head = dummy.next;
		while(head != null){
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println("");
	}
}