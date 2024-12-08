import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;
        int start = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int end = 0; end < nums.length; end++) {
            // Add the current element to the sum and the set
            sum += nums[end];

            // Handle duplicates by shrinking the window from the start
            while (set.contains(nums[end])) {
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }

            // Add the current number to the set
            set.add(nums[end]);

            // Check if the window size is valid (equal to k)
            if (end - start + 1 == k) {
                max = Math.max(max, sum);

                // Remove the start element to slide the window forward
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }
        }

        return max;
    }
}
