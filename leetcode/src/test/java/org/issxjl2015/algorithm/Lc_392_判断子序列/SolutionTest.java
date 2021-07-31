package org.issxjl2015.algorithm.Lc_392_判断子序列;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/31/21:55
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "b";
        String t = "abc";
        boolean ans = solution.isSubsequence(s, t);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "";
        String t = "ahbgdc";
        boolean ans = solution.isSubsequence(s, t);
        Assert.assertTrue(ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        boolean ans = solution.isSubsequence(s, t);
        Assert.assertTrue(ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String s = "axc";
        String t = "ahbgdc";
        boolean ans = solution.isSubsequence(s, t);
        Assert.assertFalse(ans);
    }
}
