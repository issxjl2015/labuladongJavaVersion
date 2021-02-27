package org.issxjl2015.tx.arrayandstring.lc_删除排序数组中的重复项;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        int ans = solution.removeDuplicates(nums);
        Assert.assertEquals(ans, 2);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = solution.removeDuplicates(nums);
        Assert.assertEquals(ans, 5);
    }
}
