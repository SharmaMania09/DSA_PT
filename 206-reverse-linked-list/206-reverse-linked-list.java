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
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = null;
        ListNode nextNode = null;
        
        while(head != null)
        {
            nextNode = head.next;
            head.next = temp;
            temp = head;
            head = nextNode;
        }
        
        return temp;
    }
}