package org.issxjl2015.algorithm.Lc_5_最长回文子串;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/02/23:18
 * @Description:
 */
public class SolutionTest2 {

    @Test
    public void test1() {
        Solution2 solution = new Solution2();
        String s = "babad";
        String ans = solution.longestPalindrome(s);
        Assert.assertEquals("aba", ans);
    }

    @Test
    public void test2() {
        Solution2 solution = new Solution2();
        String s = "cbba";
        String ans = solution.longestPalindrome(s);
        Assert.assertEquals("bb", ans);
    }

    @Test
    public void test3() {
        Solution2 solution = new Solution2();
        String s = "a";
        String ans = solution.longestPalindrome(s);
        Assert.assertEquals("a", ans);
    }

    @Test
    public void test4() {
        Solution2 solution = new Solution2();
        String s = "ac";
        String ans = solution.longestPalindrome(s);
        Assert.assertEquals("c", ans);
    }
}
