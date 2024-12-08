class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0;
        long sum=0;
        int start=0;
        int end=0;
        HashSet<Integer> set=new HashSet<>();
        while(end<nums.length){
            if (!set.contains(nums[end])) {
                sum += nums[end];
                set.add(nums[end]);
                end++;

                
                if (end - start == k) {
                    max = Math.max(max, sum);
                }

            } 
            else {
               
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }
        }
        return max;
    }
}