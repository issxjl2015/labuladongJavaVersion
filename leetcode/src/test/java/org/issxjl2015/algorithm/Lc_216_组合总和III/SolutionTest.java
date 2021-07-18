package org.issxjl2015.algorithm.Lc_216_组合总和III;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int k = 3;
        int n = 7;
        List<List<Integer>> ans = solution.combinationSum3(k, n);
        Assert.assertEquals(1, ans.size());
        Assert.assertEquals(1, (int) ans.get(0).get(0));
        Assert.assertEquals(2, (int) ans.get(0).get(1));
        Assert.assertEquals(4, (int) ans.get(0).get(2));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int k = 9;
        int n = 45;
        List<List<Integer>> ans = solution.combinationSum3(k, n);
        Assert.assertEquals(1, ans.size());
        Assert.assertEquals(1, (int) ans.get(0).get(0));
        Assert.assertEquals(2, (int) ans.get(0).get(1));
        Assert.assertEquals(3, (int) ans.get(0).get(2));
        Assert.assertEquals(4, (int) ans.get(0).get(3));
        Assert.assertEquals(5, (int) ans.get(0).get(4));
        Assert.assertEquals(6, (int) ans.get(0).get(5));
        Assert.assertEquals(7, (int) ans.get(0).get(6));
        Assert.assertEquals(8, (int) ans.get(0).get(7));
        Assert.assertEquals(9, (int) ans.get(0).get(8));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int k = 3;
        int n = 9;
        List<List<Integer>> ans = solution.combinationSum3(k, n);
        Assert.assertEquals(3, ans.size());
        Assert.assertEquals(1, (int) ans.get(0).get(0));
        Assert.assertEquals(2, (int) ans.get(0).get(1));
        Assert.assertEquals(6, (int) ans.get(0).get(2));
        Assert.assertEquals(1, (int) ans.get(1).get(0));
        Assert.assertEquals(3, (int) ans.get(1).get(1));
        Assert.assertEquals(5, (int) ans.get(1).get(2));
        Assert.assertEquals(2, (int) ans.get(2).get(0));
        Assert.assertEquals(3, (int) ans.get(2).get(1));
        Assert.assertEquals(4, (int) ans.get(2).get(2));
    }
}
