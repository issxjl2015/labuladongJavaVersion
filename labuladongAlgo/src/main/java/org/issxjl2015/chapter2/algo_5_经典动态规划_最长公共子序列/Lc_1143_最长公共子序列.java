package org.issxjl2015.chapter2.algo_5_经典动态规划_最长公共子序列;

public class Lc_1143_最长公共子序列 {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        // dp 数组的定义：dp(i, j) 表示 s1[0..i - 1] 和 s2[0..j - 1] 中最长公共子序列的长度
        int[][] dp = new int[m + 1][n + 1];
        // base case
        // dp 数组初始化就是0，不用再次初始化了

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // 当前字符相等
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 当前字符不相等，那么就要考虑 s1[0...i -1] 与 s2[0...j] 或者s1[0..i] 与 s2[0..j - 1] 的 LCS
                    // 其实，还有两个字符都不在LCS，但是这里是求最大值，那么这个肯定不会被取到
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

}
