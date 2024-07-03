class Solution {
    public boolean halvesAreAlike(String s) {
        String a="";
        String b="";
        int count=0;
        int sum=0;
        for(int i=0;i<s.length()/2;i++){
            a+=s.charAt(i);
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||     s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
           b+=s.charAt(i);
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||     s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
               sum++;
            }
        }
        return count==sum;
        
    }
}