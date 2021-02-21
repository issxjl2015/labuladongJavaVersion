package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_2_动态规划解题套路框架.Lc_322_零钱兑换;
import org.junit.Assert;
import org.junit.Test;

public class Lc_322_零钱兑换_Test {

    @Test
    public void test1() {
        Lc_322_零钱兑换 solution = new Lc_322_零钱兑换();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int ans = solution.coinChange1(coins, amount);
        Assert.assertEquals(ans, 3);
    }
}
