package org.issxjl2015.chapter4.algo_9_前缀和技巧解决子数组问题;

public class Lc_560_和为K的子数组 {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] preSum = new int[n + 1];
        preSum[0] = 0;
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }

        if (preSum[n] < k) {
            return 0;
        }
        int ans = 0;
        // 穷举所有数组
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (preSum[i] - preSum[j] == k) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
