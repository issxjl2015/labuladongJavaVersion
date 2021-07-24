package org.issxjl2015.algorithm.Lc_343_整数拆分;

public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                // i 拆分有两种方案：
                // 1、i = j + (i - j), 且 (i - j) 不可拆分，那么乘积：j * (i - j)
                // 2、i = j + (i - j)，而 (i - j) 还可以再拆分成其他数，那么乘积：j * dp[i - j]
                // 所以：比较 (i - j) * j 和 dp[i - j] * j 取最大的
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, dp[i - j] * j));
            }
        }

        return dp[n];
    }
}
