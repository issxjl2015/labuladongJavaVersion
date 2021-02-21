package org.issxjl2015.chapter1.algo_2_动态规划解题套路框架;

import java.util.Arrays;

public class Lc_322_零钱兑换 {

    /**
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange1(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        // 定义dp函数
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount);
        dp[0] = 0;
        // 求最小值，所以初始化为正无穷
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                // 无解的情况
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount];
    }
}
