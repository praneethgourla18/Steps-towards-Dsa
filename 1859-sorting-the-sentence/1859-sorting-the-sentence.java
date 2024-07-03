import java.util.*;

class Solution {
    public String sortSentence(String s) {
        HashMap<Integer, String> map = new HashMap<>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                // Convert the character digit to an integer and store the word in the map
                int key = s.charAt(i) - '0'; // '0' has an ASCII value of 48
                map.put(key, str.trim());
                str = "";
            } else {
                str += s.charAt(i);
            }
        }
        
        // Construct the final sorted sentence
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= map.size(); i++) {
            if (map.containsKey(i)) {
                result.append(map.get(i));
                if (i < map.size()) {
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }
}
