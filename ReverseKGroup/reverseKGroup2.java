import java.util.*;

public class reverseKGroup2{

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
			ListNode curHead = null, curTail = null, nextNode = null, prevNode = null, preTail = null;
			ListNode cur = head;
			for(int i = 0; i < outNum; i++){
				prevNode = null;
				for(int j = 0; j < k; j++){
					
					nextNode = cur.next; // Save cur.next before next line's CUT
					cur.next = prevNode; // CUT link between cur and cur.next while link cur.next to its previous node
					prevNode = cur; // Save condition of cur - in next inner loop, it will be linked by cur.next 
					if(j == 0){
						curTail = cur;	
					}
					if(j == k-1){
						curHead = cur; 
					}
					cur = nextNode;
				}
				if(preTail == null){
					head = curHead;
				}else{
					preTail.next = curHead;
				}
				preTail = curTail; 
			}
			curTail.next = cur;
			newHead = head; // For the following testing
		}
		
		// 逆序链表的基本步骤：
		// 找到当前节点的后续节点；
		// 保存当前节点的后续节点；
		// 切断当前节点和它后续节点的指针；
		// 赋值当前节点的前驱节点为当前节点，也就是说当前节点是下一个内循环的前驱结点，为prevNode做记录。
		
		// 注意：如果只要求按照原链表的逆序显示的话，那么可以直接使用递归完成。Reference: http://bbs.csdn.net/topics/370268478
		
		
		
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