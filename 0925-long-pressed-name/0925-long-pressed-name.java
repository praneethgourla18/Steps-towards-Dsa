import java.util.HashMap;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // HashMap<Character, Integer> map = new HashMap<>();

        
        // for (int i = 0; i < typed.length(); i++) {
        //     char c = typed.charAt(i);
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }

      
        // for (int i = 0; i < name.length(); i++) {
        //     char c = name.charAt(i);
        //     if (!map.containsKey(c) || map.get(c) == 0) {
        //         return false;
        //     } else {
        //         map.put(c, map.get(c) - 1);
        //     }
        // }

        // return true;

        //the above method works if the order doesnt matter
         
          int i=0;
          int j=0;

         while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
