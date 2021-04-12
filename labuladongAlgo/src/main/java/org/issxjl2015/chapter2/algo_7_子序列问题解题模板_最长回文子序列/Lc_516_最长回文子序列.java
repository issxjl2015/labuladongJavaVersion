package org.issxjl2015.chapter2.algo_7_子序列问题解题模板_最长回文子序列;

public class Lc_516_最长回文子序列 {
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

        // 反向遍历
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    // 索引 i 和 j 对应的字符相等，则 s[i...j] 的回文子序列的长度 就是 s[i + 1][j - 1] + 2
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    // 索引 i 和 j 对应的字符不相等，
                    // 则需要判断一下，字符 i 在回文子序列里，或者 字符 j 在回文子序列里，或者 字符 i 和 j 都不在回文子序列里的情况
                    // 为啥状态转移方程没有 dp[i + 1][j - 1]，因为这里是取最大值，肯定取不到这种情况
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        // 整个 s 的最大回文子序列长度
        return dp[0][len - 1];
    }
}
