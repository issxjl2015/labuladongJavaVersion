package org.issxjl2015.algorithm.Lc_704_二分查找;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ans = solution.search(nums, target);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int ans = solution.search(nums, target);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = {5};
        int target = 5;
        int ans = solution.search(nums, target);
        Assert.assertEquals(0, ans);
    }
}
