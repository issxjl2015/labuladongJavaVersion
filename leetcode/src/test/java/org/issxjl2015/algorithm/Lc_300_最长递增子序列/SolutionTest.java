package org.issxjl2015.algorithm.Lc_300_最长递增子序列;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/22:22
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {10,9,2,5,3,7,101,18};
        int ans = solution.lengthOfLIS(nums);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {0,1,0,3,2,3};
        int ans = solution.lengthOfLIS(nums);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {7,7,7,7,7,7,7};
        int ans = solution.lengthOfLIS(nums);
        Assert.assertEquals(1, ans);
    }
}
