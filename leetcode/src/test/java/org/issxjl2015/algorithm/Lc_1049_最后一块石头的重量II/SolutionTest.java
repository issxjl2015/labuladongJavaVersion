package org.issxjl2015.algorithm.Lc_1049_最后一块石头的重量II;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] stones = {2,7,4,1,8,1};
        int ans = solution.lastStoneWeightII(stones);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] stones = {31,26,33,21,40};
        int ans = solution.lastStoneWeightII(stones);
        Assert.assertEquals(5, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] stones = {1, 2};
        int ans = solution.lastStoneWeightII(stones);
        Assert.assertEquals(1, ans);
    }
}
