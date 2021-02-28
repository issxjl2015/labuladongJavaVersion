package org.issxjl2015.tx.arrayandstring.lc_存在重复元素;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        boolean ans = solution.containsDuplicate(nums);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        boolean ans = solution.containsDuplicate(nums);
        Assert.assertFalse(ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean ans = solution.containsDuplicate(nums);
        Assert.assertTrue(ans);
    }
}
