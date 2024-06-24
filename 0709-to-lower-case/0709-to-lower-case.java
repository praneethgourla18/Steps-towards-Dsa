class Solution {
    public String toLowerCase(String s) {
        String str="";
         
      for(int i=0;i<s.length();i++){
        
        char ch=s.charAt(i);
        if(ch>='A' && ch<='Z'){
            str+=(char)(ch+32);
        }
        else{
            str+=ch;
        }
        
    }
        return str;
}
}