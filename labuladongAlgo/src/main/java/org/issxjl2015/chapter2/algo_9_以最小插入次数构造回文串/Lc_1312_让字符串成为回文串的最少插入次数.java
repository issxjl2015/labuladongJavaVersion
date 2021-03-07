package org.issxjl2015.chapter2.algo_9_以最小插入次数构造回文串;

public class Lc_1312_让字符串成为回文串的最少插入次数 {
    public int minInsertions(String s) {
        if (s.length() == 1) {
            return 0;
        }
        int len = s.length();
        // dp 数组
        int[][] dp = new int[len][len];
        // base case
        for (int i = 0; i < len; i++) {
            dp[i][i] = 0;
        }

        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[0][len - 1];
    }
}
