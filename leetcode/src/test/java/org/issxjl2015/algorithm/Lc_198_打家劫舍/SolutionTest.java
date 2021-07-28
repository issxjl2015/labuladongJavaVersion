package org.issxjl2015.algorithm.Lc_198_打家劫舍;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        int ans = solution.rob(nums);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 9, 3, 1};
        int ans = solution.rob(nums);
        Assert.assertEquals(12, ans);
    }
}
