class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nsr=nextSmallR(heights);
        int[] nsl=nextSmallL(heights);
        int max = 0;
        int area=0;
        for(int i=0;i<heights.length;i++){
             area = heights[i] * (nsr[i] - nsl[i] - 1);
            if(max<area){
                max=area;
            }
        }
        return max;
    }
    public int[] nextSmallR(int[] heights){
      
       int[] ans = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = heights.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        return ans;

    }
    public int[] nextSmallL(int[] heights){
         int[] ans = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }
}