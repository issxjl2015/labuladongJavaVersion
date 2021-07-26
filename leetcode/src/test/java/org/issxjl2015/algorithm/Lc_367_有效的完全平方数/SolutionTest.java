package org.issxjl2015.algorithm.Lc_367_有效的完全平方数;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int num = 16;
        boolean ans = solution.isPerfectSquare(num);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int num = 14;
        boolean ans = solution.isPerfectSquare(num);
        Assert.assertFalse(ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int num = 32;
        boolean ans = solution.isPerfectSquare(num);
        Assert.assertFalse(ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int num = 808201;
        boolean ans = solution.isPerfectSquare(num);
        Assert.assertTrue(ans);
    }
}
