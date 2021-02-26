package org.issxjl2015.tx.dynamicprogram.lc_爬楼梯;

public class Solution {

    /**
     * dp 数组的迭代解法
     * @param n
     * @return dp(n)
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    /**
     * dp 数组的迭代解法 + 状态压缩
     * @param n n
     * @return dp(n)
     */
    public int climbStairs1(int n) {
        if (n <= 2) {
            return n;
        }
        int before_1 = 1;
        int before_2 = 2;
        int ans = before_2;
        for (int i = 3; i <= n; i++) {
            ans = before_1 + before_2;
            before_1 = before_2;
            before_2 = ans;
        }
        return ans;
    }
}
