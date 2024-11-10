import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private static final Map<Character, String> digitToLetters = new HashMap<>();
    
    static {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }
    
    private void backtrack(List<String> combinations, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        String letters = digitToLetters.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}
