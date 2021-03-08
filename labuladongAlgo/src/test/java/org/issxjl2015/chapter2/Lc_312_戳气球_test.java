package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_14_经典动态规划_戳气球问题.Lc_312_戳气球;
import org.junit.Assert;
import org.junit.Test;

public class Lc_312_戳气球_test {

    @Test
    public void test1() {
        int[] nums = {3,1,5,8};
        Lc_312_戳气球 solution  = new Lc_312_戳气球();
        int ans = solution.maxCoins(nums);
        Assert.assertEquals(167, ans);
    }

    @Test
    public void test2() {
        int[] nums = {1,5};
        Lc_312_戳气球 solution  = new Lc_312_戳气球();
        int ans = solution.maxCoins(nums);
        Assert.assertEquals(10, ans);
    }
}
