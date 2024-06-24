class Solution {
    public String interpret(String command) {
        String s="";
       for(int i=0;i<command.length();i++){
           char ch=command.charAt(i);
          if(ch=='G'){
               s+='G';
           }
          
           else if(ch=='(' && command.charAt(i+1)=='a'){
               s+="al";
           }
           else if(ch=='(' && command.charAt(i+1)==')'){
               s+='o';
           }

       }
        return s;
    }
}