package org.issxjl2015.chapter3;

import org.issxjl2015.chapter3.algo_7_特殊数据结构_单调栈.Lc_739_每日温度;
import org.junit.Assert;
import org.junit.Test;

public class Lc_739_每日温度_test {

    @Test
    public void test1() {
        Lc_739_每日温度 solution = new Lc_739_每日温度();
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = solution.dailyTemperatures(T);
        int[] expect = {1, 1, 4, 2, 1, 1, 0, 0};
        Assert.assertArrayEquals(expect, ans);
    }

}
