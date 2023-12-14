class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, maxf = 0, count[] = new int[128];
        for (int i = 0; i < s.length(); ++i) {
            maxf = Math.max(maxf, ++count[s.charAt(i)]);
            if (res - maxf < k)
                res++;
            else
                count[s.charAt(i - res)]--;
        }
        return res;
    }
}
