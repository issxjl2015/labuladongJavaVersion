package org.issxjl2015.chapter5;

import org.issxjl2015.chapter5.algo_3_如何运用二分搜索算法.Lc_1011_在D天内送达包裹的能力;
import org.junit.Assert;
import org.junit.Test;

public class Lc_1011_在D天内送达包裹的能力_test {

    @Test
    public void test1() {
        Lc_1011_在D天内送达包裹的能力 solution = new Lc_1011_在D天内送达包裹的能力();
        int[] weight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        int ans = solution.shipWithinDays(weight, D);
        Assert.assertEquals(15, ans);
    }

    @Test
    public void test2() {
        Lc_1011_在D天内送达包裹的能力 solution = new Lc_1011_在D天内送达包裹的能力();
        int[] weight = {3,2,2,4,1,4};
        int D = 3;
        int ans = solution.shipWithinDays(weight, D);
        Assert.assertEquals(6, ans);
    }

    @Test
    public void test3() {
        Lc_1011_在D天内送达包裹的能力 solution = new Lc_1011_在D天内送达包裹的能力();
        int[] weight = {1,2,3,1,1};
        int D = 4;
        int ans = solution.shipWithinDays(weight, D);
        Assert.assertEquals(3, ans);
    }
}
