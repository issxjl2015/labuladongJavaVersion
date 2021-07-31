package org.issxjl2015.algorithm.Lc_1035_不相交的线;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/31/21:10
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};
        int ans = solution.maxUncrossedLines(nums1, nums2);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums1 = {2,5,1,2,5};
        int[] nums2 = {10,5,2,1,5,2};
        int ans = solution.maxUncrossedLines(nums1, nums2);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums1 = {1,3,7,1,7,5};
        int[] nums2 = {1,9,2,5,1};
        int ans = solution.maxUncrossedLines(nums1, nums2);
        Assert.assertEquals(2, ans);
    }

}
