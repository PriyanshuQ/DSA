class MyStack {
    Queue<Integer> q1;
    int top = 0;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
        top=x;
    }
    
    public int pop() {
        int size = q1.size();
        while(size-->2){
            q1.offer(q1.poll());
        }
        top = q1.peek();
        q1.offer(q1.poll());
        return q1.poll();
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}