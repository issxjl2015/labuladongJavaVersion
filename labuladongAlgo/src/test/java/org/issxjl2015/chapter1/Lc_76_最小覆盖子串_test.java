package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架.Lc_76_最小覆盖子串;
import org.junit.Assert;
import org.junit.Test;

public class Lc_76_最小覆盖子串_test {

    @Test
    public void test1() {
        Lc_76_最小覆盖子串 solution = new Lc_76_最小覆盖子串();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = solution.minWindow(s, t);
        Assert.assertEquals("BANC", ans);
    }

    @Test
    public void test2() {
        Lc_76_最小覆盖子串 solution = new Lc_76_最小覆盖子串();
        String s = "EBBANCF";
        String t = "ABC";
        String ans = solution.minWindow(s, t);
        Assert.assertEquals("BANC", ans);
    }
}
