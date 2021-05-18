package org.issxjl2015.algorithm.Lc_15_三数之和;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = solution.threeSum(nums);
        Assert.assertEquals(-1, (int) ans.get(0).get(0));
        Assert.assertEquals(-1, (int) ans.get(0).get(1));
        Assert.assertEquals(2, (int) ans.get(0).get(2));
        Assert.assertEquals(-1, (int) ans.get(1).get(0));
        Assert.assertEquals(0, (int) ans.get(1).get(1));
        Assert.assertEquals(1, (int) ans.get(1).get(2));
    }
}
