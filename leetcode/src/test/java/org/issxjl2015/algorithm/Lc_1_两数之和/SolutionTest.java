package org.issxjl2015.algorithm.Lc_1_两数之和;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = solution.twoSum(nums, target);
        Assert.assertEquals(0, ans[0]);
        Assert.assertEquals(1, ans[1]);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] ans = solution.twoSum(nums, target);
        Assert.assertEquals(1, ans[0]);
        Assert.assertEquals(2, ans[1]);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int target = 6;

        int[] ans = solution.twoSum(nums, target);
        Assert.assertEquals(0, ans[0]);
        Assert.assertEquals(1, ans[1]);
    }
}
