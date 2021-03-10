package org.issxjl2015.chapter2.algo_17_经典动态规划_完全背包问题;

public class Lc_518_零钱兑换II {

    public int change(int amount, int[] coins) {
        // 前 i 个商品，容量为 j 时，共有 dp[i][j]种方法
        int[][] dp = new int[coins.length + 1][amount + 1];
        // base case
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }

        // 状态转移方程
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j - coins[i - 1] >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }
}
