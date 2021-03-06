package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_2_二维递增子序列_信封嵌套问题.Lc_354_俄罗斯套娃信封问题;
import org.junit.Assert;
import org.junit.Test;

public class Lc_354_俄罗斯套娃信封问题_test {

    @Test
    public void test1() {
        Lc_354_俄罗斯套娃信封问题 solution = new Lc_354_俄罗斯套娃信封问题();
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        int ans = solution.maxEnvelopes(envelopes);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Lc_354_俄罗斯套娃信封问题 solution = new Lc_354_俄罗斯套娃信封问题();
        int[][] envelopes = {{1, 1}, {1, 1}, {1, 1}};
        int ans = solution.maxEnvelopes(envelopes);
        Assert.assertEquals(1, ans);
    }
}
