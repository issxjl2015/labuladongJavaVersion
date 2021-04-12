package org.issxjl2015.chapter2.algo_9_以最小插入次数构造回文串;

public class Lc_1312_让字符串成为回文串的最少插入次数 {
    public int minInsertions(String s) {
        if (s.length() == 1) {
            return 0;
        }
        int len = s.length();
        // dp 数组的定义
        // dp[i][j] 表示 s[i...j] 要成为回文串最少插入次数
        int[][] dp = new int[len][len];
        // base case
        for (int i = 0; i < len; i++) {
            // s[i..i] 表示的单个字符，肯定是回文串，不需要插入
            dp[i][i] = 0;
        }

        // 反向遍历
        // 选择什么遍历方式是根据dp数组来的
        // 比如，最终结果为 dp[0][n - 1] 则肯定为反向遍历，i 从 n - 2 开始到 0 结束，j 从 i + 1 开始到 n - 1结束
        // 比如，最终结果为 dp[n - 1][n - 1] 则需要正向遍历，i 从 0 开始到 n - 1 结束，j 从 0 开始到 n - 1结束
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    // 状态转移方程
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[0][len - 1];
    }
}
