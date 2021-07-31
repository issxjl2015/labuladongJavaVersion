package org.issxjl2015.algorithm.Lc_1143_最长公共子序列;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/31/19:54
 * @Description:
 */
public class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        // 数组的定义 dp[i][j]：text1[0...i - 1] 与 text2[0...j - 1] 的最长公共子序列
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                // text1 下标为 i - 1的字符 与 text2 下标为 j - 1 的字符 相等
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // 递推公式
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 递推公式
                    // dp[i - 1][j]：text1[0...i - 2] 与 text2[0...j - 1] 的 最长公共子序列
                    // dp[i][j - 1]：text1[0...i - 1] 与 text2[0...j - 2] 的 最长公共子序列
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

}
