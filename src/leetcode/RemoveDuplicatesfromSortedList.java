package leetcode;

public class RemoveDuplicatesfromSortedList {
	
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)   return head;
        
        ListNode node = head;
        
        while(node != null) {
            ListNode tmp = node.next;
            while(tmp != null && node.val == tmp.val) {
                tmp = tmp.next;
            }
            node.next = tmp;
            node = node.next;
        }
        
        return head;    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
