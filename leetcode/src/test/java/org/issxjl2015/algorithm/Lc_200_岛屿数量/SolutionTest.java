package org.issxjl2015.algorithm.Lc_200_岛屿数量;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int ans = solution.numIslands(grid);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
            };
        int ans = solution.numIslands(grid);
        Assert.assertEquals(3, ans);
    }
}
