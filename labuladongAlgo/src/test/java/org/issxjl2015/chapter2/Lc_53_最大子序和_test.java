package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_3_最大子数组问题.Lc_53_最大子序和;
import org.junit.Assert;
import org.junit.Test;

public class Lc_53_最大子序和_test {

    @Test
    public void test1() {
        Lc_53_最大子序和 solution = new Lc_53_最大子序和();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(6, ans);
    }

    @Test
    public void test2() {
        Lc_53_最大子序和 solution = new Lc_53_最大子序和();
        int[] nums = {1};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Lc_53_最大子序和 solution = new Lc_53_最大子序和();
        int[] nums = {0};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test4() {
        Lc_53_最大子序和 solution = new Lc_53_最大子序和();
        int[] nums = {-1};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void test5() {
        Lc_53_最大子序和 solution = new Lc_53_最大子序和();
        int[] nums = {-10000};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(-10000, ans);
    }
}
