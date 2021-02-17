package org.issxjl2015.tx.arrayandstring.lc_最长回文子串;

/**
 * 遍历数组，
 * 从当前遍历的下标的元素为一个中心扩展或者两个中心扩展
 * 比较当前一个中心和两个中心扩展的长度，谁大
 * 根据len来确定回文串的起始下标
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expendStr(s, i , i);
            int len2 = expendStr(s, i , i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expendStr(String s, int L, int R) {
        int l = L, r = R;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}
