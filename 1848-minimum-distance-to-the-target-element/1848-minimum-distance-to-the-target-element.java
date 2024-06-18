class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
             ans=Math.abs(i-start);
             min=Math.min(min,ans);
           }
        }
        return min;
    }
}