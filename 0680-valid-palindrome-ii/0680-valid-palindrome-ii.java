class Solution {
    public boolean validPalindrome(String s) {
        String b="";
        int start=0;
        int end=s.length()-1;
        int count=0;
        while(start<end){
          if(s.charAt(start)!=s.charAt(end)){
            if(count==0){
                start++;
                count=1;
            }
            else{
              return false;
            }
           
          }
          else{
            start++;
            end--;
          }
        }
        return true;
    }
}