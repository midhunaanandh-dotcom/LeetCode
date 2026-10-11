/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node current = head;
        while(current != null){
            Node dup = new Node(current.val);
            dup.next = current.next;
            current.next = dup;
            current = dup.next;
        }
        current = head;

        while(current != null){
            Node copy = current.next;
            if(current.random != null){
                copy.random = current.random.next;
            }
            current = copy.next;
        }
        current = head;
        Node copyHead = head.next;

        while(current != null){
            Node copy = current.next;
            current.next = copy.next;

            if(copy.next != null){
                copy.next = copy.next.next;
            }
            current = current.next;
        }
        return copyHead;
    }
}