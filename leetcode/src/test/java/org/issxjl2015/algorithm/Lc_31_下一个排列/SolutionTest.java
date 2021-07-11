package org.issxjl2015.algorithm.Lc_31_下一个排列;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int[] ans = {1, 3, 2};
        solution.nextPermutation(nums);
        Assert.assertEquals(ans[0], nums[0]);
        Assert.assertEquals(ans[1], nums[1]);
        Assert.assertEquals(ans[2], nums[2]);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1};
        int[] ans = {1, 2, 3};
        solution.nextPermutation(nums);
        Assert.assertEquals(ans[0], nums[0]);
        Assert.assertEquals(ans[1], nums[1]);
        Assert.assertEquals(ans[2], nums[2]);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 5};
        int[] ans = {1, 5, 1};
        solution.nextPermutation(nums);
        Assert.assertEquals(ans[0], nums[0]);
        Assert.assertEquals(ans[1], nums[1]);
        Assert.assertEquals(ans[2], nums[2]);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] nums = {1};
        int[] ans = {1};
        solution.nextPermutation(nums);
        Assert.assertEquals(ans[0], nums[0]);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 6, 5, 7, 1};
        int[] ans = {1, 2, 3, 4, 6, 7, 1, 5};
        solution.nextPermutation(nums);
        Assert.assertEquals(ans[0], nums[0]);
        Assert.assertEquals(ans[1], nums[1]);
        Assert.assertEquals(ans[2], nums[2]);
        Assert.assertEquals(ans[3], nums[3]);
        Assert.assertEquals(ans[4], nums[4]);
        Assert.assertEquals(ans[5], nums[5]);
        Assert.assertEquals(ans[6], nums[6]);
        Assert.assertEquals(ans[7], nums[7]);
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 2};
        int[] ans = {2, 1, 3};
        solution.nextPermutation(nums);
        Assert.assertEquals(ans[0], nums[0]);
        Assert.assertEquals(ans[1], nums[1]);
        Assert.assertEquals(ans[2], nums[2]);
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        int[] nums = {4,2,0,2,3,2,0};
        int[] ans = {4,2,0,3,0,2,2};
        solution.nextPermutation(nums);
        Assert.assertEquals(ans[0], nums[0]);
        Assert.assertEquals(ans[1], nums[1]);
        Assert.assertEquals(ans[2], nums[2]);
        Assert.assertEquals(ans[3], nums[3]);
        Assert.assertEquals(ans[4], nums[4]);
        Assert.assertEquals(ans[5], nums[5]);
        Assert.assertEquals(ans[6], nums[6]);
    }

}
