class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int freq=1;
            if(map.containsKey(nums[i])){
               
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
            map.put(nums[i],freq);
            }
        }

        Set<Integer> keys=map.keySet();
        for(int key : keys){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
      return -1;
    }
}