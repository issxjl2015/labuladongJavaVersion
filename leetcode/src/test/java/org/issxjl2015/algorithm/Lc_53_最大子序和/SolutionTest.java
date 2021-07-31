package org.issxjl2015.algorithm.Lc_53_最大子序和;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/31/21:41
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(6, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {0};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] nums = {-1};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] nums = {-100000};
        int ans = solution.maxSubArray(nums);
        Assert.assertEquals(-100000, ans);
    }
}
