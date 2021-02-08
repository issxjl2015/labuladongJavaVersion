package org.issxjl2015.tx.arrayandstring.lc_2sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = solution.twoSum(nums, target);
        Assert.assertArrayEquals(ans, new int[]{0, 1});
        System.out.println("====================");
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] ans2 = solution.twoSum(nums2, target2);
        Assert.assertArrayEquals(ans2, new int[]{1, 2});
    }
}
