package org.issxjl2015.contest.biweeklycontest.biweeklycontest52;

import org.junit.Assert;
import org.junit.Test;

public class Lc_5743_增长的内存泄露_test {

    @Test
    public void test1() {
        Lc_5743_增长的内存泄露 solution = new Lc_5743_增长的内存泄露();
        int m1 = 10534;
        int m2 = 0;
        int[] ans = solution.memLeak(m1, m2);
        Assert.assertEquals(145, ans[0]);
        Assert.assertEquals(94, ans[1]);
        Assert.assertEquals(0, ans[2]);
    }
}
