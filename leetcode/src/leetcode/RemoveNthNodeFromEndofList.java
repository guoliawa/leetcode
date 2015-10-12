package leetcode;

public class RemoveNthNodeFromEndofList {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead;
        int steps = 1;
        while (steps <= n) {
            fast = fast.next;
            steps++;
        }
        
        if (fast == null) {
            return head.next;
        }
        
        while (fast.next != null) {
            pre = pre.next;
            slow = slow.next;
            fast = fast.next;
        }
        
        if (slow.next != null) {
            slow.next = slow.next.next; 
        } else {
            pre.next = null;
        }
        
        return head;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
