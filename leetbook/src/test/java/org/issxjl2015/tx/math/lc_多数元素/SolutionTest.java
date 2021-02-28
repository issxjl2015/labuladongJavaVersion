package org.issxjl2015.tx.math.lc_多数元素;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3};
        int ans = solution.majorityElement(nums);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        int ans = solution.majorityElement(nums);
        Assert.assertEquals(2, ans);
    }
}
