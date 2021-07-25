package org.issxjl2015.algorithm.Lc_1049_最后一块石头的重量II;

public class Solution {

    public int lastStoneWeightII(int[] stones) {
        int[] dp = new int[15001];
        dp[0] = 0;
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }

        int target = sum / 2;

        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }

        // 因为 sum 分成了两堆 target 的石头堆，target为向下取整，所以 sum - dp[target] >= dp[target]的
        return sum - dp[target] - dp[target];
    }

}
