package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_1_动态规划设计_最长递增子序列.Lc_300_最长递增子序列;
import org.junit.Assert;
import org.junit.Test;

public class Lc_300_最长递增子序列_test {

    @Test
    public void test1() {
        Lc_300_最长递增子序列 solution = new Lc_300_最长递增子序列();
        int[] nums = {10,9,2,5,3,7,101,18};
        int ans = solution.lengthOfLIS(nums);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Lc_300_最长递增子序列 solution = new Lc_300_最长递增子序列();
        int[] nums = {0,1,0,3,2,3};
        int ans = solution.lengthOfLIS(nums);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test3() {
        Lc_300_最长递增子序列 solution = new Lc_300_最长递增子序列();
        int[] nums = {7,7,7,7,7,7,7};
        int ans = solution.lengthOfLIS(nums);
        Assert.assertEquals(1, ans);
    }
}
