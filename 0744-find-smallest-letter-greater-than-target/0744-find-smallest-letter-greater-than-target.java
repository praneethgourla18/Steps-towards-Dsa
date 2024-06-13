class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        // int start=0;
        // int end=letters.length-1;
        // while(start<=end){
        //    int mid=start+ (end-start)/2;
        //     if(target<letters[mid]){
        //         end=mid-1;
        //     }
        //     else{
        //       start=mid+1;
        //     }
        // }
        // return letters[start%letters.length];
      
      int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                return arr[mid+1 % arr.length];
            }
             else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return arr[start%arr.length];

       
    }
}