/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head.next==null)
            return true;
        
        ListNode slow = head, fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverse(slow.next);
        
        slow = slow.next;
        
        ListNode temp = head;
        
        while(slow!=null)
        {
            if(slow.val != temp.val)
            {
                return false;
            }
            slow = slow.next;
            temp = temp.next;
        }
        
        return true;
        
    }
    
    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null, nextNode = null;
        while(head!=null)
        {
            nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        
        return prev;
    }
}