package org.issxjl2015.algorithm.Lc_34_在排序数组中查找元素的第一个和最后一个位置;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = solution.searchRange(nums, target);
        Assert.assertEquals(3, ans[0]);
        Assert.assertEquals(4, ans[1]);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] ans = solution.searchRange(nums, target);
        Assert.assertEquals(-1, ans[0]);
        Assert.assertEquals(-1, ans[1]);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {};
        int target = 0;
        int[] ans = solution.searchRange(nums, target);
        Assert.assertEquals(-1, ans[0]);
        Assert.assertEquals(-1, ans[1]);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] nums = {1};
        int target = 1;
        int[] ans = solution.searchRange(nums, target);
        Assert.assertEquals(0, ans[0]);
        Assert.assertEquals(0, ans[1]);
    }
}
