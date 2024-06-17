class Solution {
    public int[] searchRange(int[] nums, int target) {
        boolean sir=true;
        int left=firstocc( nums,target,true);
        int right=firstocc(nums,target,false);
        
        return new int[]{left,right};
    }
        static int firstocc(int[] nums,int target,boolean sir){
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            
            int mid= start +(end - start)/2;
            if(target==nums[mid]){   
                res=mid;
               if(sir)
                end=mid-1;
               else
                   start=mid+1;
            }
            else if(target>nums[mid]){
                    start=mid+1;                
            }
            else{
                 end=mid-1;
            }
        }
         return  res;
    }
      
     
    }

