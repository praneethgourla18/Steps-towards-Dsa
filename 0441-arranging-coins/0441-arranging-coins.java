class Solution {
    public int arrangeCoins(int n) {

        if(n==1){
            return 1;
        }
        int i=1;
        int rows=0;
        while(i<n){
           rows++;
           n=n-i;
           i++;
        }
        return rows;
    }
}