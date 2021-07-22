package org.issxjl2015.algorithm.Lc_62_不同路径;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int m = 3, n = 7;
        int ans =  solution.uniquePaths(m, n);
        Assert.assertEquals(28, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int m = 3, n = 2;
        int ans =  solution.uniquePaths(m, n);
        Assert.assertEquals(3, ans);
    }
}
