class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                char top=st.peek();
                char c=s.charAt(i);
                if((c == ')' && top == '(') ||
                   (c == '}' && top == '{') ||
                   (c == ']' && top == '[')) {
                    st.pop(); // Pop the matching opening bracket
                }

                else{
                    return false;
                }
            }
        }
        return true;
    }
}