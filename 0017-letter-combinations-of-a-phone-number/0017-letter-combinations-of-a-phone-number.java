class Solution {
    public List<String> letterCombinations(String digits) {
        
          List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        // Create a mapping of digits to letters
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(result, digitToLetters, digits, 0, new StringBuilder());

        return result;
    }

    private static void backtrack(List<String> result, Map<Character, String> digitToLetters, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            // We have a complete combination
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, digitToLetters, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}
