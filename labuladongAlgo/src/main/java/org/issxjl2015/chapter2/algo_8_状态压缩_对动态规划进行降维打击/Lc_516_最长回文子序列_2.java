package org.issxjl2015.chapter2.algo_8_状态压缩_对动态规划进行降维打击;

import java.util.Arrays;

public class Lc_516_最长回文子序列_2 {
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int len = s.length();
        // dp 数组定义： dp[i][j] 表示 s[i..j]中最大回文子序列
        int[] dp = new int[len];

        // base case
        Arrays.fill(dp, 1);

        for (int i = len - 2; i >= 0; i--) {
            int pre = 0;
            for (int j = i + 1; j < len; j++) {
                int temp = dp[j];
                if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = pre + 2;
                } else {
                    dp[j] = Math.max(dp[j - 1], dp[j]);
                }
                pre = temp;
            }
        }
        // 整个 s 的最大回文子序列长度
        return dp[len - 1];
    }
}
