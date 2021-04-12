package org.issxjl2015.chapter2.algo_1_动态规划设计_最长递增子序列;

import java.util.Arrays;

public class Lc_673_最长递增子序列的个数 {

    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int[] count = new int[nums.length];
        count[0] = 1;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        count[i]++;
                    }
                    max = Math.max(max, dp[i]);
                }
            }
            for (int k = 0; k < i; k++) {
                if (dp[i] == 1 ) {
                    count[i] = 1;
                } else if (dp[i] - 1 == dp[k]) {
                    count[i]++;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < count.length; i++) {
            ans = Math.max(ans, count[i]);
        }
        return ans;
    }
}
