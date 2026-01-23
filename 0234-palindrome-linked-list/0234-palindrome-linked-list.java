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
        if(head == null || head.next == null)
        return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        ListNode i = slow;
        while(i!=null){
            ListNode temp = i.next;
            i.next = prev;
            prev = i;
            i = temp;
        }
        slow = head;
        ListNode newhead = prev;
        while(newhead!=null){
            
            if(slow.val!= newhead.val)
            return false;
            slow = slow.next;
            newhead = newhead.next;
           
        }
        return true;

        
    }
}