class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){

            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
           if(nums[j]!=j+1){
            list.add(nums[j]);
           }
        }
        return list;
    }
}