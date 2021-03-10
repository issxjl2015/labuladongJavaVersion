package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_17_经典动态规划_完全背包问题.Lc_518_零钱兑换II;
import org.issxjl2015.chapter2.algo_17_经典动态规划_完全背包问题.Lc_518_零钱兑换II_2;
import org.junit.Assert;
import org.junit.Test;

public class Lc_518_零钱兑换II_2_test {

    @Test
    public void test1() {
        Lc_518_零钱兑换II_2 solution = new Lc_518_零钱兑换II_2();
        int[] coins = {1, 2, 5};
        int amount = 5;
        int ans = solution.change(amount, coins);

        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Lc_518_零钱兑换II_2 solution = new Lc_518_零钱兑换II_2();
        int[] coins = {10};
        int amount = 10;
        int ans = solution.change(amount, coins);

        Assert.assertEquals(1, ans);
    }
}
