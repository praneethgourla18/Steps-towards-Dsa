class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int[] count=new int[nums1.length];
        ArrayList<Integer> list=new ArrayList<>();
        // int k=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] count=new int[list.size()];
      for(int k=0;k<list.size();k++){
          count[k]=list.get(k);
      }
      return count;
    }
}