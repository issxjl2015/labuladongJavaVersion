package org.issxjl2015.algorithm.Lc_1143_最长公共子序列;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/31/20:13
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String text1 = "abcde";
        String text2 = "ace";
        int ans = solution.longestCommonSubsequence(text1, text2);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String text1 = "abc";
        String text2 = "abc";
        int ans = solution.longestCommonSubsequence(text1, text2);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String text1 = "abc";
        String text2 = "def";
        int ans = solution.longestCommonSubsequence(text1, text2);
        Assert.assertEquals(0, ans);
    }
}
