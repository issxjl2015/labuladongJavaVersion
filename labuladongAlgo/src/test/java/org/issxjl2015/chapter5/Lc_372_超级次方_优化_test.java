package org.issxjl2015.chapter5;

import org.issxjl2015.chapter5.algo_2_如何高效进行模幂运算.Lc_372_超级次方_优化;
import org.junit.Assert;
import org.junit.Test;

public class Lc_372_超级次方_优化_test {

    @Test
    public void test1() {
        Lc_372_超级次方_优化 solution = new Lc_372_超级次方_优化();
        int a = 2;
        int[] b = {3};
        int ans = solution.superPow(a, b);
        Assert.assertEquals(8, ans);
    }

    @Test
    public void test2() {
        Lc_372_超级次方_优化 solution = new Lc_372_超级次方_优化();
        int a = 2;
        int[] b = {1, 0};
        int ans = solution.superPow(a, b);
        Assert.assertEquals(1024, ans);
    }

    @Test
    public void test3() {
        Lc_372_超级次方_优化 solution = new Lc_372_超级次方_优化();
        int a = 1;
        int[] b = {4, 3, 3, 8, 5, 2};
        int ans = solution.superPow(a, b);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test4() {
        Lc_372_超级次方_优化 solution = new Lc_372_超级次方_优化();
        int a = 2147483647;
        int[] b = {2, 0, 0};
        int ans = solution.superPow(a, b);
        Assert.assertEquals(1198, ans);
    }
    
}
