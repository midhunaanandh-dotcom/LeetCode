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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        int n = 0;
        while(curr != null){
            curr = curr.next;
            n++;
        }

        int mid = n/2;
        if(mid == 0){
            return null;
        }else if(n == 1){
            head.next = null;
            return head;
        }else{
            System.out.println(mid);
            ListNode current = head;
            for(int i = 0; i < mid-1; i++){
                current = current.next;
            }
            current.next = current.next.next;
            return head;
        }
        
    }
}