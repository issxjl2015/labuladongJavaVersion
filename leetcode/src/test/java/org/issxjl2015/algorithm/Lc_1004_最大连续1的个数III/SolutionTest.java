package org.issxjl2015.algorithm.Lc_1004_最大连续1的个数III;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/20:10
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = solution.longestOnes(nums, k);
        Assert.assertEquals(6, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int ans = solution.longestOnes(nums, k);
        Assert.assertEquals(10, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {0,0,0,1};
        int k = 4;
        int ans = solution.longestOnes(nums, k);
        Assert.assertEquals(4, ans);
    }
}
