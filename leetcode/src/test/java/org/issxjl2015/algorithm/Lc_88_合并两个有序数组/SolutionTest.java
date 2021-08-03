package org.issxjl2015.algorithm.Lc_88_合并两个有序数组;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/03/22:45
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        solution.merge(nums1, m, nums2, n);

        int[] expectedArr = {1, 2, 2, 3, 5, 6};
        for (int i = 0; i < expectedArr.length; i++) {
            Assert.assertEquals(expectedArr[i], nums1[i]);
        }
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        solution.merge(nums1, m, nums2, n);

        int[] expectedArr = {1};
        for (int i = 0; i < expectedArr.length; i++) {
            Assert.assertEquals(expectedArr[i], nums1[i]);
        }
    }
}
