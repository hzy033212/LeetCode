public class MergeSort{

	public static ListNode Merge(ListNode ln1, ListNode ln2){
			ListNode dummy = new ListNode(0);
			ListNode cur = dummy;
			while(ln1 != null && ln2 != null){
				if(ln1.val > ln2.val){
					cur.next = ln2;
					ln2 = ln2.next;
				}else if(ln1.val <= ln2.val){
					cur.next = ln1;
					ln1 = ln1.next;
				}
				cur = cur.next;
			} 
			if(ln1 == null && ln2 != null){
				cur.next = ln2;
			}else if(ln2 == null && ln1 != null){
				cur.next = ln1;
			}
			return dummy.next;
		}
		
		public static int length(ListNode ln){
			int length = 0;
			while(ln != null){
				ln = ln.next;
				length++;
			}
			return length;
		}
		
		public static ListNode Cut(ListNode ln){
			ListNode mid = null;
			ListNode fast = ln;
			ListNode slow = ln;
			while(fast.next != null && fast.next.next != null){
				fast = fast.next.next;
				slow = slow.next;
			}
			return slow;
		}
		
		public static ListNode mergeSort(ListNode ln){
			if(ln == null || ln.next == null){
				return ln;
			}
			
			ListNode mid = Cut(ln);
			ListNode right = mergeSort(mid.next);
			mid.next = null;
			ListNode left = mergeSort(ln);
			
			return Merge(left, right);
		}

	public static void main(String args[]){
		
		// Main part
		
		// test sample
		ListNode ln1 = new ListNode(2);
		ListNode ln2 = new ListNode(9);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(6);
		ListNode ln5 = new ListNode(10);
		ListNode ln6 = new ListNode(1);
		ListNode ln7 = new ListNode(5);
		ListNode ln8 = new ListNode(4);
		ListNode ln9 = new ListNode(7);
		ListNode ln10 = new ListNode(8);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln6.next = ln7;
		ln7.next = ln8;
		ln8.next = ln9;
		ln9.next = ln10;
		ListNode root = ln1;
		
		int length = length(root);
		ListNode result = mergeSort(root);
		for(int i = 0; i < length; i++){
			System.out.print(result.val + "-> ");
			result = result.next;
		}
		System.out.println("");
		
	}
}