class Solution {
    public int[] nextGreaterElement(int[] arr, int[] arr2) {
          Stack<Integer> s1 = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[arr.length];

        // Traverse arr2 to find the next greater elements
        for (int i = arr2.length - 1; i >= 0; i--) {
            while (!s1.isEmpty() && s1.peek() <= arr2[i]) {
                s1.pop();
            }
            map.put(arr2[i], s1.isEmpty() ? -1 : s1.peek());
            s1.push(arr2[i]);
        }

        // Populate the ans array based on the elements in arr
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}