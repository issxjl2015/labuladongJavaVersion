package org.issxjl2015.chapter1.algo_2_动态规划解题套路框架;

import java.util.Arrays;

public class Lc_322_零钱兑换 {

    /**
     * 暴力迭代
     * @param coins 硬币数值数组
     * @param amount 总金额
     * @return 最少硬币数
     */
    public int coinChange1(int[] coins, int amount) {
        // base case
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subproblem = coinChange1(coins, amount - coin);
            // 子问题无解，跳过
            if (subproblem == -1) continue;
            res = Math.min(res, 1 + subproblem);
        }

        return res != Integer.MAX_VALUE ? res : -1;
    }


    /**
     * dp 数组的迭代解法
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange2(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        // 定义dp函数
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
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
        return dp[amount] == (amount + 1) ? -1 : dp[amount];
    }
}
