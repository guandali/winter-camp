public class MyQueue {
    
    Stack<Integer> st0 = new Stack<Integer>();
    Stack<Integer> st1 = new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        st0.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!st0.empty()){
            st1.push(st0.pop());
        }
        int ans = st1.pop();
        while(! st1.empty()){
            st0.push(st1.pop());
            
        }
        return ans;
    }
    
    /** Get the front element. */
    public int peek() {
       while(!st0.empty()){
            st1.push(st0.pop());
        }
        int ans = st1.peek();
        while(! st1.empty()){
            st0.push(st1.pop());
            
        }
        return ans;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return st0.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */