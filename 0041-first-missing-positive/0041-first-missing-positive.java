class Solution {
    public int firstMissingPositive(int[] nums) {

        //brute force

        // int max=nums[0];
        // for(int i=1;i<nums.length;i++){
        //    if(nums[i]>max){
        //     max=nums[i];
        //    }
        // }
        // int[] arr=new int[max+1];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>=0){
        //         arr[nums[i]]=nums[i];
        //     }
           
        // }
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]==0){
        //         return i;

        //     }
        // }
        // return max+1;

      //optimal 

       int i=0;
        while(i<nums.length){

            int correct=nums[i]-1;
            
            if(correct>=nums.length || correct<0){
                i++;
            }
            else{
                 if(nums[correct]!=nums[i]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
            }
           
        }
        if(nums.length==2){
           if(nums[0]!=1){
                return 1;
            }
            else{
                return nums.length+1;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
            
        }   
        return nums.length;
    }
}