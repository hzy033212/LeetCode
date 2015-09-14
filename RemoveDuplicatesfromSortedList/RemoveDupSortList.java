public class RemoveDupSortList{
	public static void main(String args[]){
		//Test set
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(1);
		ListNode ln3 = new ListNode(2);
		ListNode ln4 = new ListNode(3);
		ListNode ln5 = new ListNode(4);
		ListNode root = ln1;
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		
		//Main algorithm
		ListNode head = root;
		while(root != null){
			if(root.next != null && root.val == root.next.val){
				root.next = root.next.next;
			}
			root = root.next;
		}
		
		//Output result
		while(head != null){
			System.out.print( head.val + "->");
			head = head.next;
		}
		System.out.println("");
	}
}