import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        // Mapping of digits to letters
        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        // Helper function to perform backtracking
        backtrack(result, phoneMap, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, Map<Character, String> phoneMap, String digits, int index, StringBuilder current) {
        // Base case: If the current combination is complete
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get the characters for the current digit
        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);

        // Iterate through the characters and build combinations
        for (char letter : letters.toCharArray()) {
            current.append(letter); // Add a letter to the combination
            backtrack(result, phoneMap, digits, index + 1, current); // Recurse
            current.deleteCharAt(current.length() - 1); // Remove the last letter for backtracking
        }
    }
}
