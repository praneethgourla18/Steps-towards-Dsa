class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];

        int prod=1;

        for(int i=0;i<nums.length;i++){
           prefix[i]=prod*nums[i];
           prod=prefix[i];
        }
        
        int sum=1;
        for(int i=nums.length-1;i>=0;i--){
           suffix[i]=sum*nums[i];
           sum=suffix[i];
        }
        nums[0]=suffix[0];
        nums[nums.length-1]=prefix[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            nums[i]=prefix[i-1]*suffix[i+1];
        }
        return nums;
    }
}