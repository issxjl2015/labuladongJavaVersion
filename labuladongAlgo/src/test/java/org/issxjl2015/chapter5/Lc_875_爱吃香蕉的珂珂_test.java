package org.issxjl2015.chapter5;

import org.issxjl2015.chapter5.algo_3_如何运用二分搜索算法.Lc_875_爱吃香蕉的珂珂;
import org.junit.Assert;
import org.junit.Test;

public class Lc_875_爱吃香蕉的珂珂_test {

    @Test
    public void test1() {
        Lc_875_爱吃香蕉的珂珂 solution = new Lc_875_爱吃香蕉的珂珂();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int ans = solution.minEatingSpeed(piles, h);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Lc_875_爱吃香蕉的珂珂 solution = new Lc_875_爱吃香蕉的珂珂();
        int[] piles = {30,11,23,4,20};
        int h = 5;
        int ans = solution.minEatingSpeed(piles, h);
        Assert.assertEquals(30, ans);
    }

    @Test
    public void test3() {
        Lc_875_爱吃香蕉的珂珂 solution = new Lc_875_爱吃香蕉的珂珂();
        int[] piles = {30,11,23,4,20};
        int h = 6;
        int ans = solution.minEatingSpeed(piles, h);
        Assert.assertEquals(23, ans);
    }
}
