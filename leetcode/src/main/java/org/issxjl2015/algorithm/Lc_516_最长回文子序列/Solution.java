package org.issxjl2015.algorithm.Lc_516_最长回文子序列;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/05/22:35
 * @Description:
 */
public class Solution {
    public int longestPalindromeSubseq(String s) {
        // dp[i][j] 表示 s[i...j] 之间的最长回文子序列的长度
        int[][] dp = new int[s.length()][s.length()];
        // 初始化
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }

        for (int i = s.length() - 2; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                // 状态转移方程
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][s.length() - 1];
    }
}
