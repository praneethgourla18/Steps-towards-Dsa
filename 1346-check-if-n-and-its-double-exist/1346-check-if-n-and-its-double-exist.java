class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]*2)){
                return true;
            }
            else if(set.contains(arr[i]/2) && arr[i]%2==0){
                return true;
            }
            
        }
      return false;
    }
}