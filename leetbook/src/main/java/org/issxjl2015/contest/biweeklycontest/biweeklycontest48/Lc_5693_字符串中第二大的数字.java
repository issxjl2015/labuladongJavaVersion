package org.issxjl2015.contest.biweeklycontest.biweeklycontest48;

import java.util.Arrays;
import java.util.TreeSet;

public class Lc_5693_字符串中第二大的数字 {
    public int secondHighest(String s) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                if (d > ans[0]) {
                    ans[1] = ans[0];
                    ans[0] = d;
                } else if (d < ans[0] && d > ans[1]) {
                    ans[1] = d;
                }
            }
        }
        return ans[1];
    }
}
