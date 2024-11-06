class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=binarySearch(nums,target,true);
        arr[1]=binarySearch(nums,target,false);

        return arr;
    }
    static int binarySearch(int[] nums,int target,boolean first){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            // if(first){
            //     if(nums[mid]==target){
            //         ans=mid;
            //         end=mid-1;
            //     }
            //     else if(nums[mid]>target){
            //         end=mid-1;
            //     }
            //     else{
            //         start=mid+1;
            //     }
            // }
            // else{
            //      if(nums[mid]==target){
            //         ans=mid;
            //         start=mid+1;
            //     }
            //     else if(nums[mid]>target){
            //         end=mid-1;
            //     }
            //     else{
            //         start=mid+1;
            //     }
            // }
            if(nums[mid]==target){
                   if(first){
                      ans=mid;
                      end=mid-1;
                   }
                   else{
                      ans=mid;
                      start=mid+1;
                   }
                   
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
        }
        return ans;
    }
}