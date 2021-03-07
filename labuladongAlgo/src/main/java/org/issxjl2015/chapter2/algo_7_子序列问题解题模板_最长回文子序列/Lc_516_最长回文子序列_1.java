package org.issxjl2015.chapter2.algo_7_子序列问题解题模板_最长回文子序列;

public class Lc_516_最长回文子序列_1 {
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int len = s.length();
        // dp 数组定义： dp[i][j] 表示 s[i..j]中最大回文子序列
        int[][] dp = new int[len][len];

        // base case
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (i > j) {
                    dp[i][j] = 0;
                } else {
                    // s[i..i] 表示只有一个字符
                    dp[i][j] = 1;
                }
            }
        }

        // 变量 l 用来辅助斜向遍历
        for (int l = 2; l <= len; l++) {
            for (int i = 0; i <= len - l; i++) {
                int j = l + i - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        // 整个 s 的最大回文子序列长度
        return dp[0][len - 1];
    }
}
