package org.issxjl2015.algorithm.Lc_416_分割等和子集;

public class Solution {

    public boolean canPartition(int[] nums) {
        // dp[i] 表示背包总容量为 i， 可以凑出来的最大价值和为 dp[i]
        int[] dp = new int[10001];
        dp[0] = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) return false;
        int target = sum / 2;

        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        // 其实就是判断容量为sum的背包，是否刚好能放下
        if (dp[target] == target) {
            return true;
        }
        return false;
    }

}
