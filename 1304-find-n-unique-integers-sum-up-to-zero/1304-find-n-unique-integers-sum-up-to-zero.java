class Solution {
    public int[] sumZero(int n) {
        if(n==1){
            return new int[] {0};
        }
        if(n==2){

        }
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++){
            arr[i]=i+1;
            sum+=arr[i];
        }
        
        int num=-sum;
        arr[n-1]=num;
        return arr;

    }
}