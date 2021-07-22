package org.issxjl2015.algorithm.Lc_746_使用最小花费爬楼梯;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] cost = {10, 15, 20};
        int ans = solution.minCostClimbingStairs(cost);
        Assert.assertEquals(15, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int ans = solution.minCostClimbingStairs(cost);
        Assert.assertEquals(6, ans);
    }
}
