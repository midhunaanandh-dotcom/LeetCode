class MyLinkedList {
    Node head;
    int size = 0;

    public MyLinkedList() {}
        
    private class Node{
        int val;
        Node next;

        Node(){};
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }  
    }
    
    
    public int get(int index) {
        Node temp = this.head;
        if(index >= size || index < 0){
            return -1;
        }

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val, this.head);
        this.head = newNode;
        this.size += 1;
    }
    
    public void addAtTail(int val) {
        if(this.head == null){
            this.head = new Node(val);
        }else{
            Node newNode = new Node(val);
            Node temp = head;
            for(int i = 0; i < size-1; i++){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        this.size += 1;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return; 
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        this.size += 1;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0){
            return;
        }
        if(index == 0){
            this.head = head.next;
        }else{
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        this.size -= 1;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */