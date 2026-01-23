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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddhead = new ListNode();
        ListNode evenhead = new ListNode();
        ListNode oddtail = oddhead;
        ListNode eventail = evenhead;
        int count = 1;
        ListNode current = head;
        if(head == null || head.next == null)
        return head;
        while(current!= null ){
            if(count%2 == 1){
                oddtail.next = new ListNode(current.val);
                oddtail = oddtail.next;

            }
            else
            {
                eventail.next = new ListNode(current.val);
                eventail = eventail.next;
            }
            count++;
            current = current.next;
            

        }
        oddtail.next = evenhead.next;
        return oddhead.next;
        

        
    }
}