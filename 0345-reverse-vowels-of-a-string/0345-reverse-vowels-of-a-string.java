class Solution {
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            // Find the first vowel from the start
            while (i < j && !isVowel(charArray[i])) {
                i++;
            }
            
            // Find the first vowel from the end
            while (i < j && !isVowel(charArray[j])) {
                j--;
            }
            
            // Swap the vowels
            if (i < j) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(charArray);
    }
}