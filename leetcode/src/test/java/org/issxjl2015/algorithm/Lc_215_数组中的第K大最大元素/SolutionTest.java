package org.issxjl2015.algorithm.Lc_215_数组中的第K大最大元素;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Solution solution = new Solution();
        int ans = solution.findKthLargest(nums, k);
        Assert.assertEquals(5, ans);
    }

    @Test
    public void test2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        Solution solution = new Solution();
        int ans = solution.findKthLargest(nums, k);
        Assert.assertEquals(4, ans);
    }
}
