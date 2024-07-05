class Solution {
    public void reverseString(char[] s) {
        reverseArr(s,0,s.length-1);
    }
    static void reverseArr(char[] s,int a,int b){
        //TYPE --1
//         if(a>b){
//             return;
//         }
        
//         char temp=s[a];
//         s[a]=s[b];
//         s[b]=temp;
       
//       reverseArr(s,a+1,b-1);
// TYPE -2
        while(a<=b){
            char temp=s[a];
            s[a]=s[b];
            s[b]=temp;
            
            a++;
            b--;
        }
    }
}