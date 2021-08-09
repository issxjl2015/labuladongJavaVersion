package org.issxjl2015.algorithm.Lc_496_下一个更大元素I;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/09/23:25
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] ans = solution.nextGreaterElement(nums1, nums2);
        int[] expectArr = {-1, 3, -1};
        for (int i = 0; i < ans.length; i++) {
            Assert.assertEquals(expectArr[i], ans[i]);
        }
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] ans = solution.nextGreaterElement(nums1, nums2);
        int[] expectArr = {3, -1};
        for (int i = 0; i < ans.length; i++) {
            Assert.assertEquals(expectArr[i], ans[i]);
        }
    }
}
