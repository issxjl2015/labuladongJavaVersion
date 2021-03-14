package org.issxjl2015.contest.weeklycontest.weeklycontest232;

import org.issxjl2015.contest.weeklycontest.weeklycontest232.algo_5701_仅执行一次字符串交换能否使两个字符串相等.Solution;
import org.junit.Assert;
import org.junit.Test;

public class algo_5701_仅执行一次字符串交换能否使两个字符串相等_test {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s1 = "bank";
        String s2 = "kanb";
        boolean ans = solution.areAlmostEqual(s1, s2);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s1 = "attack";
        String s2 = "defend";
        boolean ans = solution.areAlmostEqual(s1, s2);
        Assert.assertFalse(ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s1 = "kelb";
        String s2 = "kelb";
        boolean ans = solution.areAlmostEqual(s1, s2);
        Assert.assertTrue(ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String s1 = "abcd";
        String s2 = "dcba";
        boolean ans = solution.areAlmostEqual(s1, s2);
        Assert.assertFalse(ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        String s1 = "a";
        String s2 = "z";
        boolean ans = solution.areAlmostEqual(s1, s2);
        Assert.assertFalse(ans);
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        String s1 = "aa";
        String s2 = "bb";
        boolean ans = solution.areAlmostEqual(s1, s2);
        Assert.assertFalse(ans);
    }

}
