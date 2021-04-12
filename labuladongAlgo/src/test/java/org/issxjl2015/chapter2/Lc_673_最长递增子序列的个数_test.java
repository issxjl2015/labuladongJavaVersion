package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_1_动态规划设计_最长递增子序列.Lc_673_最长递增子序列的个数;
import org.junit.Assert;
import org.junit.Test;

public class Lc_673_最长递增子序列的个数_test {

    @Test
    public void test1() {
        Lc_673_最长递增子序列的个数 solution = new Lc_673_最长递增子序列的个数();
        int[] nums = {1,3,5,4,7};
        int ans = solution.findNumberOfLIS(nums);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Lc_673_最长递增子序列的个数 solution = new Lc_673_最长递增子序列的个数();
        int[] nums = {1,1,1,1,1};
        int ans = solution.findNumberOfLIS(nums);
        Assert.assertEquals(5, ans);
    }
}
