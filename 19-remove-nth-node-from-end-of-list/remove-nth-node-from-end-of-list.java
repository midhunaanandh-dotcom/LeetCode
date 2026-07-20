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
        int length = 0;
        ListNode curr = head;
        ListNode curr2 = head;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        if(length == 1){
            return null;
        }
        int k = length - n;
        int count = 1;
        if(k == 0){
            return head.next;
        }
        while(curr2 != null && curr2.next != null){
            if(count == k){
                curr2.next = curr2.next.next;
                return head;
            }
            count++;
            curr2 = curr2.next;
        }

        return head;
    }
}