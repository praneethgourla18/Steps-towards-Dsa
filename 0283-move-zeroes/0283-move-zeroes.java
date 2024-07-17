class Solution {
    public void moveZeroes(int[] nums) {

        //BRUTE FORCE

        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         list.add(nums[i]);
        //     }
        // }
        // int nz=list.size();
        // for(int i=0;i<nz;i++){
        //     nums[i]=list.get(i);
        // }
        // for(int i=nz;i<nums.length;i++){
        //     nums[i]=0;
        // }


        //OPTIMAL

        int i=0;
        int n=nums.length;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        for(int k=i;k<n;k++){
            nums[k]=0;
        }
    }
}