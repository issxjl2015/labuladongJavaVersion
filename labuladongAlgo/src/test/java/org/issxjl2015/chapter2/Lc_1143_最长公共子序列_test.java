package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_5_经典动态规划_最长公共子序列.Lc_1143_最长公共子序列;
import org.junit.Assert;
import org.junit.Test;

public class Lc_1143_最长公共子序列_test {

    @Test
    public void test1() {
        Lc_1143_最长公共子序列 solution = new Lc_1143_最长公共子序列();
        String text1 = "abcde";
        String text2 = "ace";
        int ans = solution.longestCommonSubsequence(text1, text2);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Lc_1143_最长公共子序列 solution = new Lc_1143_最长公共子序列();
        String text1 = "abc";
        String text2 = "abc";
        int ans = solution.longestCommonSubsequence(text1, text2);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test3() {
        Lc_1143_最长公共子序列 solution = new Lc_1143_最长公共子序列();
        String text1 = "abc";
        String text2 = "def";
        int ans = solution.longestCommonSubsequence(text1, text2);
        Assert.assertEquals(0, ans);
    }
}
