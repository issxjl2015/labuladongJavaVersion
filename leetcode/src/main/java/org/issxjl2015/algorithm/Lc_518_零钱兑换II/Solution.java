package org.issxjl2015.algorithm.Lc_518_零钱兑换II;

/**
 * 效率上，代码随想录的解法 要优于 labuladong 的解法
 */
public class Solution {

    public int change(int amount, int[] coins) {
        // 定义 dp[j] 数组：表示 总金额为 j 时，有 dp[j] 种 组合方法
        int[] dp = new int[amount + 1];
        // 初始化（base case）
        dp[0] = 1;
        // 先遍历 物品，后遍历 容量
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <=amount; j++) {
                // 题目要求是组合数，那么：dp[j] 就是所有的 dp[j - coins[i]] 相加
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }

}
