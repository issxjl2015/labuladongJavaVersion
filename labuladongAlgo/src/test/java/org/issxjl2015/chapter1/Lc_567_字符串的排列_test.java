package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架.Lc_567_字符串的排列;
import org.junit.Assert;
import org.junit.Test;

public class Lc_567_字符串的排列_test {

    @Test
    public void test1() {
        Lc_567_字符串的排列 solution = new Lc_567_字符串的排列();
        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean ans = solution.checkInclusion(s1, s2);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Lc_567_字符串的排列 solution = new Lc_567_字符串的排列();
        String s1 = "ab";
        String s2 = "eidboaoo";

        boolean ans = solution.checkInclusion(s1, s2);
        Assert.assertFalse(ans);
    }
}
