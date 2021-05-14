package org.issxjl2015.algorithm.Lc_3_无重复字符的最长子串;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "abcabcbb";
        int ans = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "bbbbb";
        int ans = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "pwwkew";
        int ans = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String s = "";
        int ans = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(0, ans);
    }
}
