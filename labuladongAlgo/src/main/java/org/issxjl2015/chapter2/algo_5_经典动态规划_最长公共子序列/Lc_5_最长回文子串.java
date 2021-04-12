package org.issxjl2015.chapter2.algo_5_经典动态规划_最长公共子序列;

public class Lc_5_最长回文子串 {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // 以 i 为中心扩展
            int len1 = expendStr(s, i, i);
            // 以 i + 1 为中心扩展
            int len2 = expendStr(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // 获取回文子串长度
    private int expendStr(String s, int L, int R) {
        int l = L, r = R;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}

