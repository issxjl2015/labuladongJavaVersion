package org.issxjl2015.contest.weeklycontest.weeklycontest241;

import org.issxjl2015.contest.weeklycontest.weeklycontest241.algo_5759_找出所有子集的异或总和再求和.Solution;
import org.junit.Assert;
import org.junit.Test;

public class algo_5759_找出所有子集的异或总和再求和_test {

    @Test
    public void test1() {
        int[] nums = {1, 3};
        Solution solution = new Solution();
        int ans = solution.subsetXORSum(nums);
        Assert.assertEquals(6, ans);
    }

    @Test
    public void test2() {
        int[] nums = {5, 1, 6};
        Solution solution = new Solution();
        int ans = solution.subsetXORSum(nums);
        Assert.assertEquals(28, ans);
    }

    @Test
    public void test3() {
        int[] nums = {3, 4, 5, 6, 7, 8};
        Solution solution = new Solution();
        int ans = solution.subsetXORSum(nums);
        Assert.assertEquals(480, ans);
    }
}
