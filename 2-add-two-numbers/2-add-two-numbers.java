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
        
    private static final ListNode ZERO_NODE = new ListNode(0);
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        return recursiveSol(l1, l2, 0);
    }
    public ListNode recursiveSol(ListNode l1, ListNode l2, int carry)
    {
        int sum = l1.val+l2.val+carry;
        int newcarry = sum/10;
        
        ListNode r = new ListNode(sum%10);
        if(l1.next==null && l2.next==null)
        {
            if(newcarry>0)
                r.next = new ListNode(newcarry);
        }
        else
        {
            r.next = recursiveSol(
                (l1.next == null) ? ZERO_NODE:l1.next,
                (l2.next == null) ? ZERO_NODE:l2.next,
                newcarry
            );
        }
        return r;
    }
}