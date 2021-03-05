package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架.Lc_3_无重复字符的最长子串;
import org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架.Lc_3_无重复字符的最长子串_2;
import org.junit.Assert;
import org.junit.Test;

public class Lc_3_无重复字符的最长子串_2_test {

    @Test
    public void test1() {
        Lc_3_无重复字符的最长子串_2 solution = new Lc_3_无重复字符的最长子串_2();
        String s = "abcabcbb";
        int ans = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Lc_3_无重复字符的最长子串_2 solution = new Lc_3_无重复字符的最长子串_2();
        String s = "bbbbb";
        int ans = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Lc_3_无重复字符的最长子串_2 solution = new Lc_3_无重复字符的最长子串_2();
        String s = "";
        int ans = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(0, ans);
    }
}
