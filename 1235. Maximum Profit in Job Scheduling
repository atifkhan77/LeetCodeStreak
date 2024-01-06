import bisect

class Solution:
    def jobScheduling(self, s: List[int], e: List[int], p: List[int]) -> int:
        n = len(s)
        st = [(s[i], i) for i in range(n)]
        st.sort()
        dp = [0] * (n + 1)
        for i in range(n - 1, -1, -1):
            next_compatible = bisect.bisect_left(st, (e[st[i][1]], 0), i + 1)
            dp[i] = max(dp[i + 1], p[st[i][1]] + dp[next_compatible])
        return dp[0]
