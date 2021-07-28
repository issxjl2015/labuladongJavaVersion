package org.issxjl2015.algorithm.Lc_213_打家劫舍II;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/28/21:29
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 2};
        int ans = solution.rob(nums);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        int ans = solution.rob(nums);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 2};
        int ans = solution.rob(nums);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] nums = {1};
        int ans = solution.rob(nums);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] nums = {0};
        int ans = solution.rob(nums);
        Assert.assertEquals(0, ans);
    }
}
