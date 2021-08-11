package org.issxjl2015.algorithm.Lc_1208_尽可能使字符串相等;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/22:48
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int ans = solution.equalSubstring(s, t, maxCost);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "abcd";
        String t = "cdef";
        int maxCost = 3;
        int ans = solution.equalSubstring(s, t, maxCost);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "krrgw";
        String t = "zjxss";
        int maxCost = 19;
        int ans = solution.equalSubstring(s, t, maxCost);
        Assert.assertEquals(2, ans);
    }
}
