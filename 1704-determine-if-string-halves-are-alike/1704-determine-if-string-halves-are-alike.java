class Solution {
    public boolean halvesAreAlike(String s) {
        int v1=0;
        int v2=0;
        for(int i=0;i<(s.length())/2;i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v1++;
            }
        }
         for(int i=(s.length())/2;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v2++;
            }
        }
        return v1==v2;
    }
}