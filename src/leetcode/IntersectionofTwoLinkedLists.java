package leetcode;


public class IntersectionofTwoLinkedLists {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        
        ListNode node = headA;
        
        while (node != null) {
        	countA ++;
        	node = node.next;
        }
        
        node = headB;
        
        while (node != null) {
        	countB ++;
        	node = node.next;
        }
        
        ListNode headLong = headA, headShort = headB;
        
        int countdiff = Math.abs(countA - countB);
        
        if (countA < countB) {
        	headLong = headB;
        	headShort = headA;
        }
        
        while (countdiff > 0) {
        	headLong = headLong.next;
        	countdiff --;
        }
        
        while (headLong != null) {
        	if (headLong == headShort) return headLong;
        	headLong = headLong.next;
        	headShort = headShort.next;
        }
        
		return null;
	}

	public static void main(String[] args) {
		// http://www.danielbit.com/blog/puzzle/leetcode/leetcode-intersection-of-two-linked-lists

	}

}
