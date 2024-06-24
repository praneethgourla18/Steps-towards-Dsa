class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Convert the input string to lowercase and remove non-alphanumeric characters
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch>='a' && ch<='z') {
                sb.append(ch);
            }
            else if(ch>='A' && ch<='Z'){
                sb.append((char)(ch+32));
            }
            else if(ch>=0 && ch<=9){
                sb.append(ch);
            }
        }

        String cleanedString = sb.toString();

        // Step 2: Check if the cleaned string is a palindrome
        int start = 0;
        int end = cleanedString.length() - 1;

        while (start < end) {
            if (cleanedString.charAt(start) != cleanedString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
