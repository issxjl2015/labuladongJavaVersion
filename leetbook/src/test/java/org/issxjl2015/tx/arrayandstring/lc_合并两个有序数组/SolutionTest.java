package org.issxjl2015.tx.arrayandstring.lc_合并两个有序数组;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        int[] exceptnums1 = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(exceptnums1, nums1);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        solution.merge(nums1, m, nums2, n);
        int[] exceptnums1 = {1};
        Assert.assertArrayEquals(exceptnums1, nums1);
    }
}
