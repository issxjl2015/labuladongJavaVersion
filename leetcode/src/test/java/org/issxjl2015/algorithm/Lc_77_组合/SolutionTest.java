package org.issxjl2015.algorithm.Lc_77_组合;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int n = 4;
        int k = 2;
        List<List<Integer>> ans = solution.combine(n, k);
        Assert.assertEquals(2, (int) ans.get(0).get(0));
        Assert.assertEquals(4, (int) ans.get(0).get(1));
        Assert.assertEquals(3, (int) ans.get(1).get(0));
        Assert.assertEquals(4, (int) ans.get(1).get(1));
        Assert.assertEquals(2, (int) ans.get(2).get(0));
        Assert.assertEquals(3, (int) ans.get(2).get(1));
        Assert.assertEquals(1, (int) ans.get(3).get(0));
        Assert.assertEquals(2, (int) ans.get(3).get(1));
        Assert.assertEquals(1, (int) ans.get(4).get(0));
        Assert.assertEquals(3, (int) ans.get(4).get(1));
        Assert.assertEquals(1, (int) ans.get(5).get(0));
        Assert.assertEquals(4, (int) ans.get(5).get(1));
    }
}
