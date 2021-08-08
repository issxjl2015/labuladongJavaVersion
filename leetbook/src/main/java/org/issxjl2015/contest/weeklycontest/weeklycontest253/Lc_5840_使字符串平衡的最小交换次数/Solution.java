package org.issxjl2015.contest.weeklycontest.weeklycontest253.Lc_5840_使字符串平衡的最小交换次数;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/14:56
 * @Description:
 */
public class Solution {
    public int minSwaps(String s) {
        int max = 0, val = 0;
        for (int i = 0; i < s.length(); i++) {
            val += s.charAt(i) == ']' ? 1 : -1;
            max = Math.max(max, val);
        }
        return (max + 1) / 2;
    }
}
