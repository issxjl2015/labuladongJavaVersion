package org.issxjl2015.algorithm.Lc_718_最长重复子数组;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};

        int ans = solution.findLength(nums1, nums2);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums1 = {0, 0, 0, 0, 1};
        int[] nums2 = {1, 0, 0, 0, 0};

        int ans = solution.findLength(nums1, nums2);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums1 = {0,0,0,0,0,0,1,0,0,0};
        int[] nums2 = {0,0,0,0,0,0,0,1,0,0};

        int ans = solution.findLength(nums1, nums2);
        Assert.assertEquals(9, ans);
    }
}
