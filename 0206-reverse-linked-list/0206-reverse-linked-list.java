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
        ListNode prev = null;
        ListNode i = head;
        while(i!=null){
            ListNode temp = i.next;
            i.next = prev;
            prev = i;
            i = temp;

            
        }
        return prev;
        
    }
}