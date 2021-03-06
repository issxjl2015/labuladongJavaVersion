package org.issxjl2015.chapter2.algo_2_二维递增子序列_信封嵌套问题;

import java.util.Arrays;
import java.util.Comparator;

public class Lc_354_俄罗斯套娃信封问题 {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;

        // 按照一维升序，二维降序 排序
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
            }
        });

        // 对高度数组寻找 LIS
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = envelopes[i][1];
        }

        return lengthOfLIS(height);
    }

    private int lengthOfLIS(int[] height) {
        if (height.length == 1) {
            return 1;
        }

        int[] dp = new int[height.length];
        // base case
        Arrays.fill(dp, 1);

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                if (height[i] > height[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i : dp) {
            ans = Math.max(ans, i);
        }
        return ans;
    }
}
