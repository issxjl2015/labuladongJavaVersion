package org.issxjl2015.algorithm.Lc_59_螺旋矩阵II;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int n = 3;
        int[][] ans = solution.generateMatrix(n);
        Assert.assertEquals(1, ans[0][0]);
        Assert.assertEquals(2, ans[0][1]);
        Assert.assertEquals(3, ans[0][2]);
        Assert.assertEquals(8, ans[1][0]);
        Assert.assertEquals(9, ans[1][1]);
        Assert.assertEquals(4, ans[1][2]);
        Assert.assertEquals(7, ans[2][0]);
        Assert.assertEquals(6, ans[2][1]);
        Assert.assertEquals(5, ans[2][2]);
    }


    @Test
    public void test2() {
        Solution solution = new Solution();
        int n = 1;
        int[][] ans = solution.generateMatrix(n);
        Assert.assertEquals(1, ans[0][0]);
    }
}
