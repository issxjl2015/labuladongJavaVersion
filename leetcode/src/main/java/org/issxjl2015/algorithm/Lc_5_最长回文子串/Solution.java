package org.issxjl2015.algorithm.Lc_5_最长回文子串;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/02/23:11
 * @Description:
 */
public class Solution {
    public String longestPalindrome(String s) {
        int lenS = s.length();

        int start = 0, end = 0;
        for (int i = 0; i < lenS; i++) {
            int len1 = expendStr(s, i, i);
            int len2 = expendStr(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expendStr(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
