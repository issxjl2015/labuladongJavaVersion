package org.issxjl2015.algorithm.Lc_40_组合总和II;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = solution.combinationSum2(candidates, target);
        Assert.assertEquals(1, (int) ans.get(0).get(0));
        Assert.assertEquals(1, (int) ans.get(0).get(1));
        Assert.assertEquals(6, (int) ans.get(0).get(2));
        Assert.assertEquals(1, (int) ans.get(1).get(0));
        Assert.assertEquals(2, (int) ans.get(1).get(1));
        Assert.assertEquals(5, (int) ans.get(1).get(2));
        Assert.assertEquals(1, (int) ans.get(2).get(0));
        Assert.assertEquals(7, (int) ans.get(2).get(1));
        Assert.assertEquals(2, (int) ans.get(3).get(0));
        Assert.assertEquals(6, (int) ans.get(3).get(1));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] candidates = {2,5,2,1,2};
        int target = 5;
        List<List<Integer>> ans = solution.combinationSum2(candidates, target);
        Assert.assertEquals(1, (int) ans.get(0).get(0));
        Assert.assertEquals(2, (int) ans.get(0).get(1));
        Assert.assertEquals(2, (int) ans.get(0).get(2));
        Assert.assertEquals(5, (int) ans.get(1).get(0));
    }
}
