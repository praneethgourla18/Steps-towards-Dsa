// class MinStack {
//     private Stack<int[]> stack;

//     public MinStack() {
//         stack = new Stack<>();
//     }
    
//     public void push(int val) {
//         // If the stack is empty, the min is the value itself
//         if (stack.isEmpty()) {
//             stack.push(new int[]{val, val});
//         } else {
//             // The new min is the smaller one between the current value and the current min
//             int currentMin = stack.peek()[1];
//             stack.push(new int[]{val, Math.min(val, currentMin)});
//         }
//     }

//     public void pop() {
//         stack.pop();
//     }
    
//     public int top() {
//         return stack.peek()[0];
//     }
    
//     public int getMin() {
//         return stack.peek()[1];
//     }
// }
//Mwthod -2

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        
        // Push the new minimum value onto the minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int poppedValue = stack.pop();
        
        // If the popped value is the current minimum, pop it from the minStack as well
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */