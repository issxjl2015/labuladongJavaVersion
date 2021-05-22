package org.issxjl2015.algorithm.Lc_47_全排列II;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        List<List<Integer>> ans = solution.permuteUnique(nums);
        Assert.assertEquals(1, (int) ans.get(0).get(0));
        Assert.assertEquals(1, (int) ans.get(0).get(1));
        Assert.assertEquals(2, (int) ans.get(0).get(2));
        Assert.assertEquals(1, (int) ans.get(1).get(0));
        Assert.assertEquals(2, (int) ans.get(1).get(1));
        Assert.assertEquals(1, (int) ans.get(1).get(2));
        Assert.assertEquals(2, (int) ans.get(2).get(0));
        Assert.assertEquals(1, (int) ans.get(2).get(1));
        Assert.assertEquals(1, (int) ans.get(2).get(2));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 2};
        List<List<Integer>> ans = solution.permuteUnique(nums);
        Assert.assertEquals(1, (int) ans.get(0).get(0));
        Assert.assertEquals(2, (int) ans.get(0).get(1));
        Assert.assertEquals(3, (int) ans.get(0).get(2));
        Assert.assertEquals(1, (int) ans.get(1).get(0));
        Assert.assertEquals(3, (int) ans.get(1).get(1));
        Assert.assertEquals(2, (int) ans.get(1).get(2));
        Assert.assertEquals(2, (int) ans.get(2).get(0));
        Assert.assertEquals(1, (int) ans.get(2).get(1));
        Assert.assertEquals(3, (int) ans.get(2).get(2));
        Assert.assertEquals(2, (int) ans.get(3).get(0));
        Assert.assertEquals(3, (int) ans.get(3).get(1));
        Assert.assertEquals(1, (int) ans.get(3).get(2));
        Assert.assertEquals(3, (int) ans.get(4).get(0));
        Assert.assertEquals(1, (int) ans.get(4).get(1));
        Assert.assertEquals(2, (int) ans.get(4).get(2));
        Assert.assertEquals(3, (int) ans.get(5).get(0));
        Assert.assertEquals(2, (int) ans.get(5).get(1));
        Assert.assertEquals(1, (int) ans.get(5).get(2));
    }
}
