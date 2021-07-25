package org.issxjl2015.algorithm.Lc_518_零钱兑换II;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int amount = 5;
        int[] coins = {1, 2, 5};
        int ans = solution.change(amount, coins);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int amount = 3;
        int[] coins = {2};
        int ans = solution.change(amount, coins);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int amount = 10;
        int[] coins = {10};
        int ans = solution.change(amount, coins);
        Assert.assertEquals(1, ans);
    }
}
