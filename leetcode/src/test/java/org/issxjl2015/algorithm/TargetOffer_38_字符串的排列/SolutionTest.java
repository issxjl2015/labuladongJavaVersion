package org.issxjl2015.algorithm.TargetOffer_38_字符串的排列;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "abc";
        String[] ans = solution.permutation(s);
        Assert.assertEquals("acb", ans[0]);
        Assert.assertEquals("bca", ans[1]);
        Assert.assertEquals("abc", ans[2]);
        Assert.assertEquals("cba", ans[3]);
        Assert.assertEquals("bac", ans[4]);
        Assert.assertEquals("cab", ans[5]);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "aab";
        String[] ans = solution.permutation(s);
        Assert.assertEquals("aba", ans[0]);
        Assert.assertEquals("aab", ans[1]);
        Assert.assertEquals("baa", ans[2]);
    }
}
