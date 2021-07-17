package org.issxjl2015.algorithm.Lc_287_寻找重复数;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 4, 2, 2};
        int ans = solution.findDuplicate(nums);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {3, 1, 3, 4, 2};
        int ans = solution.findDuplicate(nums);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {1, 1};
        int ans = solution.findDuplicate(nums);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        int ans = solution.findDuplicate(nums);
        Assert.assertEquals(1, ans);
    }
}
