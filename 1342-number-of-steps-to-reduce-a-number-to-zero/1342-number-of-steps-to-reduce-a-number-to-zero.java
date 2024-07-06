class Solution {
    public int numberOfSteps(int num) {
        
        return Steps(num,0);
    }
   
     private int Steps(int num,int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            return Steps(num/2,count+1);
        }
        
        return Steps(num-1,count+1);
    }
}