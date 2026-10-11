class BrowserHistory {
    class Node{
        String url = null;
        Node next;
        Node prev;

        public Node(String url){
            this.url = url;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node current;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        current = head;
    }
    
    public void visit(String url) {
        Node page = new Node(url);
        current.next = page;
        page.prev = current;
        current = page;
    }
    
    public String back(int steps) {
        for(int i = 0; i < steps; i++){
            if(current.prev != null){
                current = current.prev;
            }else{
                break;
            }
        }
        return current.url;
    }
    
    public String forward(int steps) {
        
        for(int i = 0; i < steps; i++){
            if(current.next != null){
                current = current.next;
            }else{
                break;
            }
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */