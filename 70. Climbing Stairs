class Solution {
public:
    int climbStairs(int n) {
        vector<int> dp(n+1,0);
        dp[0] = 1;

        for(int i = 1;i<n+1;i++){
            dp[i] = dp[i-1];
            if ( i> 1) dp[i] += dp[i-2];
        }
        return dp[n];
    }
};
