package org.issxjl2015.tx.arrayandstring.lc_除自身以外数组的乘积;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 1};
        int[] ans = solution.productExceptSelf(nums);
        int[] expectInt = {1, 1};
        Assert.assertArrayEquals(expectInt, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5,7};
        int[] ans = solution.productExceptSelf(nums);
        int[] expectInt = {840,420,280,210,168,120};
        Assert.assertArrayEquals(expectInt, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        int[] ans = solution.productExceptSelf(nums);
        int[] expectInt = {24,12,8,6};
        Assert.assertArrayEquals(expectInt, ans);
    }
}
