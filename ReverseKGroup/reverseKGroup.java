import java.util.*;

public class reverseKGroup{

	public static ListNode find(ListNode head, int n){
		ListNode temp = head;
		for(int i = 0; i < n - 1; i++){
			if(temp.next != null){
				temp = temp.next;
			}else{
				return null;
			}
		}
		return temp;
	}

	public static void main(String args[]){
		// Construct a test List
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = null;
		// Output this test List
		System.out.print(ln1.val);
		System.out.print("->");
		System.out.print(ln1.next.val);
		System.out.print("->");
		System.out.print(ln1.next.next.val);
		System.out.print("->");
		System.out.print(ln1.next.next.next.val);
		System.out.print("->");
		System.out.print(ln1.next.next.next.next.val);
		System.out.println("");
		
		// Parameters Set
		int k = 3;
		ListNode head = ln1;
		
		
		// Main Algorithm
		// NOTE: I can only use k and ln1 as known parameters!
		
		ListNode newHead = head;
		
		// Calculate whole length of this list.
		int length = 1; 
		ListNode temp = head;
		while(temp.next != null){
			length++;
			temp = temp.next;
		}
		// System.out.println("The length of this list is " + length);
		// Calculate how many outer loops will be needed.
		int outNum = length/k;
		if(outNum == 0){
			newHead = head;
		}else{
			ListNode preTail = null, curHead = null, curTail = null;
			ListNode preNode = null, nextNode = null;
			ListNode cur = head;
			for(int j = 0; j < outNum; j++){
				preNode = null;
				for(int i = 0; i < k; i++){
					if(cur != null){
						nextNode = cur.next;
						cur.next = preNode;
						preNode = cur;
					}
					if(i == 0){
						curTail = cur;
					}
					if(i == k-1){
						curHead = cur;
					}
					cur = nextNode;
				}
				if(preTail == null) head = curHead;
				else preTail.next = curHead;
				preTail = curTail;
			}
			curTail.next = cur;
			newHead = head;
		}
		
		
		
		
		
		
		
		// Output this result List
		System.out.print(newHead.val);
		System.out.print("->");
		System.out.print(newHead.next.val);
		System.out.print("->");
		System.out.print(newHead.next.next.val);
		System.out.print("->");
		System.out.print(newHead.next.next.next.val);
		System.out.print("->");
		System.out.print(newHead.next.next.next.next.val);
		System.out.println("");
		
	}
}