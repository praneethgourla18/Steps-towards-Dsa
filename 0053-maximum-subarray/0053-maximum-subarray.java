class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
            currentSum += nums[i];
            
              if (currentSum < 0) {
                currentSum = 0;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
          
        }
        
        if(maxSum>0){
            return maxSum;
        }
        else{
            return min;
        }
    }
}