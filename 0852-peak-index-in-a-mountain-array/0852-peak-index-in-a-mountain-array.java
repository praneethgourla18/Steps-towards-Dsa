class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=arr[0];
        int maxIdx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIdx=i;
            }
        }
        return maxIdx ;
    }

}