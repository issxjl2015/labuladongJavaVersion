package org.issxjl2015.algorithm.Lc_343_整数拆分;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int n = 2;
        int ans = solution.integerBreak(n);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int n = 10;
        int ans = solution.integerBreak(n);
        Assert.assertEquals(36, ans);
    }
}
