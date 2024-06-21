class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] prefix=new int[nums.length];
        // int[] suffix=new int[nums.length];

        // int prod=1;

        // for(int i=0;i<nums.length;i++){
        //    prefix[i]=prod*nums[i];
        //    prod=prefix[i];
        // }
        
        // int sum=1;
        // for(int i=nums.length-1;i>=0;i--){
        //    suffix[i]=sum*nums[i];
        //    sum=suffix[i];
        // }
        // nums[0]=suffix[1];
        // nums[nums.length-1]=prefix[nums.length-2];
        // for(int i=1;i<nums.length-1;i++){
        //     nums[i]=prefix[i-1]*suffix[i+1];
        // }
        // return nums;

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate the prefix product for each element and store it in the result array
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate the suffix product for each element and multiply it with the corresponding prefix product
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }
}