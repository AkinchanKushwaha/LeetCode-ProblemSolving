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
        int length = 0 ;
        
        ListNode temp = head;
        
        while(temp != null) {
        	length++;
        	temp = temp.next;
        }
        
        
        if(n == length) {
        	head = head.next;
        	return head;
        }
        int i = 0;
        temp = head;
        while(i != length-n-1) {
        	temp = temp.next;
        	i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}