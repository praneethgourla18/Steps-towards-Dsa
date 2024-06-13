class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        //BRUTE-FORCE O(N);
    //     int max=arr[0];
    //     int maxIdx=0;
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //             maxIdx=i;
    //         }
    //     }
    //     return maxIdx ;
    // }

    int start=0;
    int end=arr.length-1;

    while(start<end){

        int mid=start+ (end-start)/2;

        if(arr[mid]>arr[mid+1]){
            //you are in decreasing part

            end=mid;
        }
        else if(arr[mid]<arr[mid+1]){
            start=mid+1;
        }
    }
    return start;

}
}