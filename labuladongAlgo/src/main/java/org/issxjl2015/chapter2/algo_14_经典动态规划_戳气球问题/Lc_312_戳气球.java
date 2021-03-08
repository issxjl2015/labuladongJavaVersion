package org.issxjl2015.chapter2.algo_14_经典动态规划_戳气球问题;

public class Lc_312_戳气球 {

    public int maxCoins(int[] nums) {
        int len = nums.length;
        // 添加两侧的虚拟气球
        int[] points = new int[len + 2];
        points[0] = points[len + 1] = 1;
        for (int i = 1; i < len + 1; i++) {
            points[i] = nums[i - 1];
        }

        // base case 已经初始化为 0 了
        int[][] dp = new int[len + 2][len + 2];
        // 状态转移方程
        for (int i = len; i >= 0; i--) {
            for (int j = i + 1; j < len + 2; j++) {
                // 最后戳破的气球是哪个？
                for (int k = i + 1; k < j; k++) {
                    // 择优做选择
                    dp[i][j] = Math.max(
                            dp[i][j],
                            dp[i][k] + dp[k][j] + points[i] * points[j] * points[k]
                    );
                }
            }
        }
        return dp[0][len + 1];
    }
}
