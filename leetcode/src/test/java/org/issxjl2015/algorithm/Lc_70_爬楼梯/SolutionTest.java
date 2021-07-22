package org.issxjl2015.algorithm.Lc_70_爬楼梯;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int n =  2;
        int ans = solution.climbStairs(n);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int n =  3;
        int ans = solution.climbStairs(n);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int n = 11;
        int ans = solution.climbStairs(n);
        Assert.assertEquals(144, ans);
    }
}
