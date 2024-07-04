class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb=new StringBuilder();
         int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
               sb.append(reverse(s,start,i-1));   
               sb.append(' ');
               start=i+1;
            }
            if(i==s.length()-1){
               sb.append(reverse(s,start,i));
            }
        }
      return sb.toString();
    }
    static String reverse(String s,int start ,int end){
      String st="";
      for(int i=end;i>=start;i--){
        st+=s.charAt(i);
      }
      return st;
    }
}