package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_9_以最小插入次数构造回文串.Lc_1312_让字符串成为回文串的最少插入次数;
import org.issxjl2015.chapter2.algo_9_以最小插入次数构造回文串.Lc_1312_让字符串成为回文串的最少插入次数_1;
import org.junit.Assert;
import org.junit.Test;

public class Lc_1312_让字符串成为回文串的最少插入次数_1_test {

    @Test
    public void test1() {
        Lc_1312_让字符串成为回文串的最少插入次数_1 solution = new Lc_1312_让字符串成为回文串的最少插入次数_1();

        String s = "leetcode";
        int ans = solution.minInsertions(s);
        Assert.assertEquals(5, ans);
    }

    @Test
    public void test2() {
        Lc_1312_让字符串成为回文串的最少插入次数_1 solution = new Lc_1312_让字符串成为回文串的最少插入次数_1();

        String s = "zzazz";
        int ans = solution.minInsertions(s);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Lc_1312_让字符串成为回文串的最少插入次数_1 solution = new Lc_1312_让字符串成为回文串的最少插入次数_1();

        String s = "mbadm";
        int ans = solution.minInsertions(s);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test4() {
        Lc_1312_让字符串成为回文串的最少插入次数_1 solution = new Lc_1312_让字符串成为回文串的最少插入次数_1();

        String s = "g";
        int ans = solution.minInsertions(s);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test5() {
        Lc_1312_让字符串成为回文串的最少插入次数_1 solution = new Lc_1312_让字符串成为回文串的最少插入次数_1();

        String s = "no";
        int ans = solution.minInsertions(s);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test6() {
        Lc_1312_让字符串成为回文串的最少插入次数_1 solution = new Lc_1312_让字符串成为回文串的最少插入次数_1();

        String s = "eed";
        int ans = solution.minInsertions(s);
        Assert.assertEquals(1, ans);
    }
}
