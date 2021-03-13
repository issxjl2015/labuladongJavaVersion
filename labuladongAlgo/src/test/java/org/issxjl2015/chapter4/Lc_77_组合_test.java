package org.issxjl2015.chapter4;

import org.issxjl2015.chapter4.algo_1_回溯算法解决子集集合排序问题.Lc_77_组合;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Lc_77_组合_test {

    @Test
    public void test1() {
        Lc_77_组合 solution = new Lc_77_组合();
        int n = 3;
        int k = 2;
        List<List<Integer>> ans = solution.combine(n, k);
        System.out.println(ans);
        Assert.assertEquals(3, ans.size());
    }

    @Test
    public void test2() {
        Lc_77_组合 solution = new Lc_77_组合();
        int n = 4;
        int k = 2;
        List<List<Integer>> ans = solution.combine(n, k);
        System.out.println(ans);
        Assert.assertEquals(6, ans.size());
    }
}
