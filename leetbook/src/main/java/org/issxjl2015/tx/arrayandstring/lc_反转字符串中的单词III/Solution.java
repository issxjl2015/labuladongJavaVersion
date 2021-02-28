package org.issxjl2015.tx.arrayandstring.lc_反转字符串中的单词III;

import java.util.Arrays;

public class Solution {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String[] ss = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            String ssb = reverseStr(ss[i]);
            sb.append(ssb);
            if (i != ss.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String reverseStr(String s) {
        int left = 0, right  = s.length() - 1;
        char[] ss = s.trim().toCharArray();
        while (left < right) {
            char ch = ss[left];
            ss[left] = ss[right];
            ss[right] = ch;
            left++;
            right--;
        }
        return String.valueOf(ss);
    }
}
