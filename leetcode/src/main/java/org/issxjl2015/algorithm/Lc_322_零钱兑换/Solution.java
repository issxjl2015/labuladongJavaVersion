package org.issxjl2015.algorithm.Lc_322_零钱兑换;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] 定义： 表示总金额为 i 需要 dp[i] 个硬币
        int[] dp = new int[amount + 1];
        // 初始化数组 dp
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        // 先遍历容量，再遍历物品
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[amount] == amount + 1) {
            return -1;
        }
        return dp[amount];
    }
}
