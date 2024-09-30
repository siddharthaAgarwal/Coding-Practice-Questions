class Node {

    Node(int val)
    {
        this.val=val;
    }
    Node prev, next;
    int val;
}

class CustomStack {

    Node head, tail;
    int currSize=0;
    int maxSize=0;
    public CustomStack(int maxSize) {
        head = new Node(-1);
        tail = head;
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(currSize ==maxSize)
            return; 

        
        Node temp = new Node(x);
        tail.next =temp;
        temp.prev = tail;
        tail = tail.next;
        currSize++;
    }
    
    public int pop() {
        if(currSize ==0)
        {
            return -1;
        }
        currSize--;
        int val=tail.val;
        tail = tail.prev;
        tail.next = null;
        return val;
    }
    
    public void increment(int k, int val) {
        Node temp = head.next;
        for(int i=0; i<Math.min(k,currSize);i++)
        {
            // System.out.println(temp.val);
            temp.val = temp.val+val;
            temp = temp.next;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */