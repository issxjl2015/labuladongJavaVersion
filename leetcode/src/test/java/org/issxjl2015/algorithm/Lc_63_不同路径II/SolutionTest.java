package org.issxjl2015.algorithm.Lc_63_不同路径II;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int ans = solution.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] obstacleGrid = {{0,1},{0,0}};
        int ans = solution.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[][] obstacleGrid = {{1,0}};
        int ans = solution.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(0, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[][] obstacleGrid = {{1},{0}};
        int ans = solution.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(0, ans);
    }
}
