package org.issxjl2015.contest.biweeklycontest.biweeklycontest48;

import org.junit.Assert;
import org.junit.Test;

public class Lc_5712_你能构造出连续值的最大数目_test {

    @Test
    public void test1() {
        Lc_5712_你能构造出连续值的最大数目 solution = new Lc_5712_你能构造出连续值的最大数目();
        int[] coins = {1, 3};
        int ans = solution.getMaximumConsecutive(coins);
        System.out.println(ans);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Lc_5712_你能构造出连续值的最大数目 solution = new Lc_5712_你能构造出连续值的最大数目();
        int[] coins = {1, 1, 1, 4};
        int ans = solution.getMaximumConsecutive(coins);
        System.out.println(ans);
        Assert.assertEquals(8, ans);
    }

    @Test
    public void test3() {
        Lc_5712_你能构造出连续值的最大数目 solution = new Lc_5712_你能构造出连续值的最大数目();
        int[] coins = {1, 4, 10, 3, 1};
        int ans = solution.getMaximumConsecutive(coins);
        System.out.println(ans);
        Assert.assertEquals(20, ans);
    }
}
