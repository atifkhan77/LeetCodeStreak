class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array of strings lexicographically
        Arrays.sort(strs);

        // The common prefix can only be as long as the shortest string in the array
        String shortestStr = strs[0];
        StringBuilder longestPrefix = new StringBuilder();

        for (int i = 0; i < shortestStr.length(); i++) {
            if (strs[strs.length - 1].charAt(i) == shortestStr.charAt(i)) {
                longestPrefix.append(shortestStr.charAt(i));
            } else {
                break;
            }
        }

        return longestPrefix.toString(); 
    }
}