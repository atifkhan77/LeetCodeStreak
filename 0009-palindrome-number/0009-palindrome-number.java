class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder reverseStr = new StringBuilder(str).reverse();
        return str.equals(reverseStr.toString());
    }
}