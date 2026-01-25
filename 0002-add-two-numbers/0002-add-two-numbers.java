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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode one = l1;
        ListNode two = l2;
        ListNode i = head;
        int sum = 0;
        int carry = 0;
        while(one!= null || two!= null){
            if(one!= null && two!= null)
            sum = one.val + two.val + carry;
            else if(one== null)
            sum = two.val+ carry;
            else if(two == null)
            sum = one.val+ carry;

            carry = sum/10;
            
            i.next = new ListNode(sum%10);
            i = i.next;
            if(one!=null)
            one = one.next;
            if(two!=null)
            two = two.next;
        }
        if(carry!=0)
        i.next = new ListNode(carry);
        return head.next;
        
    }
}