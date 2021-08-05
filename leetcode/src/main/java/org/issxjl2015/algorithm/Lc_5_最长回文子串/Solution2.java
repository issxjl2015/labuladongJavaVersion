package org.issxjl2015.algorithm.Lc_5_最长回文子串;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/02/23:11
 * @Description:
 */
public class Solution2 {
    public String longestPalindrome(String s) {
        int len = s.length();

        int start = 0, end = 0;
        int maxLen = 1;
        // dp[i][j] 表示 s[i...j] 是否为回文子串
        boolean[][] dp = new boolean[len][len];
        System.out.println(dp[0][0]);
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
