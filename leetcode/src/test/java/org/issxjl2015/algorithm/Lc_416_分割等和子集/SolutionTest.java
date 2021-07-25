package org.issxjl2015.algorithm.Lc_416_分割等和子集;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 5, 11, 5};
        boolean ans = solution.canPartition(nums);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 5};
        boolean ans = solution.canPartition(nums);
        Assert.assertFalse(ans);
    }
}
