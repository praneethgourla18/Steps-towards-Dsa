class MyStack {
    private Queue<Integer> queue;
    private Queue<Integer> helper;

    public MyStack() {
        queue = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x); // Add the element to the main queue
    }

    public int pop() {
        // Transfer all elements except the last one to the helper queue
        while (queue.size() > 1) {
            helper.add(queue.remove());
        }

        // Remove and store the last element (the stack's top element)
        int ans = queue.remove();

        // Swap the queues
        Queue<Integer> temp = queue;
        queue = helper;
        helper = temp;

        return ans;
    }

    public int top() {
        // Transfer all elements except the last one to the helper queue
        while (queue.size() > 1) {
            helper.add(queue.remove());
        }

        // Peek at the last element (the stack's top element)
        int ans = queue.peek();

        // Move the last element to the helper queue
        helper.add(queue.remove());

        // Swap the queues
        Queue<Integer> temp = queue;
        queue = helper;
        helper = temp;

        return ans;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
