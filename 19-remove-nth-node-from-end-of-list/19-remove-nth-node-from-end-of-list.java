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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        ListNode newNode = new ListNode(0);
        
        newNode.next = head;
        
        ListNode temp1 = newNode;
        ListNode temp2 = newNode;
        
        while(n>0)
        {
            n--;
            temp2 = temp2.next;
        }
        
        while(temp2.next != null)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        temp1.next = temp1.next.next;
        
        return newNode.next;
        
        
        
    }
}