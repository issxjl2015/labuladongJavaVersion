package org.issxjl2015.algorithm.Lc_518_零钱兑换II;

public class Solution2 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        // 定义 dp[i][j]数组：使用前 i 个物品，当背包容量为 j 时，有 dp[i][j] 种方法可以装满背包
        int[][] dp = new int[n + 1][amount + 1];

        // base case
        for (int i = 0; i <= n; i++) {
            // 容量为 0 时，只有一种组合方法
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j - coins[i - 1] >= 0) {
                    // 不使用coins[i]这个面值的硬币，凑出总金额为j的方法 dp[i][j] 应该就是 dp[i - 1[j]
                    // 使用 coins[i]这个面值的硬币，那么 dp[i][j] 应该等于 dp[i][j - coins[i - 1]]
                    // 由于 i 是从 1 开始的，所以 coins 的索引是 i - 1 时，表示第 i 个硬币的面值
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
