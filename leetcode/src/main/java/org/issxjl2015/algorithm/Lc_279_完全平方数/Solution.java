package org.issxjl2015.algorithm.Lc_279_完全平方数;

import java.util.Arrays;

public class Solution {

    public int numSquares(int n) {
        int sqrt = (int)Math.sqrt(n);

        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 0; i <= sqrt; i++) {
            int tmp = i * i;
            for (int j = tmp; j <= n; j++) {
                dp[j] = Math.min(dp[j], dp[j - tmp] + 1);
            }
        }

        return dp[n];
    }

}
