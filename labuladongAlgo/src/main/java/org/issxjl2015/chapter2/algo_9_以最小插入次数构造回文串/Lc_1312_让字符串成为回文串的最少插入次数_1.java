package org.issxjl2015.chapter2.algo_9_以最小插入次数构造回文串;

public class Lc_1312_让字符串成为回文串的最少插入次数_1 {
    /**
     * 基于动态规划算法，进行了二维 dp 数组 状态压缩为 一维 dp 数组
     * @param s s
     * @return 最少的插入次数
     */
    public int minInsertions(String s) {
        if (s.length() == 1) {
            return 0;
        }
        int len = s.length();
        // dp 数组
        int[] dp = new int[len];
        // base case
        // 不用初始化了，因为 dp 数组 new 出来本身就是 0

        int temp = 0;
        for (int i = len - 2; i >= 0; i--) {
            // 记录 dp[i + 1][j - 1]
            int pre = 0;
            for (int j = i + 1; j < len; j++) {
                temp = dp[j];
                if (s.charAt(i) == s.charAt(j)) {
                    // dp[i][j] = dp[i + 1][j - 1];
                    dp[j] = pre;
                } else {
                    // dp[i][j] = Math.min(dp[i][j - 1], dp[i + 1][j]) + 1;
                    dp[j] = Math.min(dp[j], dp[j - 1]) + 1;
                }
                pre = temp;
            }
        }

        return dp[len - 1];
    }
}
