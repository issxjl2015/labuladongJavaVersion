package org.issxjl2015.algorithm.Lc_746_使用最小花费爬楼梯;

/**
 * 题目描述不清楚，应该理解为：最后一个阶梯之后才是楼顶，而不是最后一个阶梯就是楼梯
 *
 * 但是事实上，最后一个阶梯就是楼顶啊，对出题人真是无语
 */
public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }

}
