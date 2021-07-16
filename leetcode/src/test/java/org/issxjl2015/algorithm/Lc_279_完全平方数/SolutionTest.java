package org.issxjl2015.algorithm.Lc_279_完全平方数;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int n = 12;
        int ans = solution.numSquares(n);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int n = 13;
        int ans = solution.numSquares(n);
        Assert.assertEquals(2, ans);
    }
}
