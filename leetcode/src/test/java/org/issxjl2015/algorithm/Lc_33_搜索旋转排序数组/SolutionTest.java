package org.issxjl2015.algorithm.Lc_33_搜索旋转排序数组;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int ans = solution.search(nums, target);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int ans = solution.search(nums, target);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {1};
        int target = 0;

        int ans = solution.search(nums, target);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] nums = {1};
        int target = 1;

        int ans = solution.search(nums, target);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] nums = {1, 3};
        int target = 2;

        int ans = solution.search(nums, target);
        Assert.assertEquals(-1, ans);
    }
}
