package org.issxjl2015.algorithm.Lc_322_零钱兑换;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int ans = solution.coinChange(coins, amount);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] coins = {2};
        int amount = 3;
        int ans = solution.coinChange(coins, amount);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] coins = {1};
        int amount = 0;
        int ans = solution.coinChange(coins, amount);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] coins = {1};
        int amount = 1;
        int ans = solution.coinChange(coins, amount);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] coins = {1};
        int amount = 2;
        int ans = solution.coinChange(coins, amount);
        Assert.assertEquals(2, ans);
    }
}
