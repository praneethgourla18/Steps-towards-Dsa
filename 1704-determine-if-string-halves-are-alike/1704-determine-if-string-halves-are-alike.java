class Solution {
    public boolean halvesAreAlike(String s) {

      
      //Brute force


        // int v1=0;
        // int v2=0;
        // for(int i=0;i<(s.length())/2;i++){
        //     if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
        //         v1++;
        //     }
        // }
        //  for(int i=(s.length())/2;i<s.length();i++){
        //     if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
        //         v2++;
        //     }
        // }
        // return v1==v2;

        //optimized

       int n = s.length();
        int v1 = 0, v2 = 0;
        
        // Use a set to store vowels for quick lookup
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        // Iterate over the string, checking both halves simultaneously
        for (int i = 0; i < n / 2; i++) {
            if (vowels.contains(s.charAt(i))) {
                v1++;
            }
            if (vowels.contains(s.charAt(n - 1 - i))) {
                v2++;
            }
        }
        
        return v1 == v2;
    
    }
}