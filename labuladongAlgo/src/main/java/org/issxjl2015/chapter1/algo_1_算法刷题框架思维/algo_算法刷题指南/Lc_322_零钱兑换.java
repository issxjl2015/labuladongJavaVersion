package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_算法刷题指南;

import java.util.Arrays;

public class Lc_322_零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        // 遍历dp
        for (int i = 0; i < dp.length; i++) {
            // 遍历 coins
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
