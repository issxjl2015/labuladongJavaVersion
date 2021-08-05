package org.issxjl2015.algorithm.Lc_516_最长回文子序列;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/05/22:45
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "bbbab";
        int ans = solution.longestPalindromeSubseq(s);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "cbbd";
        int ans = solution.longestPalindromeSubseq(s);
        Assert.assertEquals(2, ans);
    }
}
