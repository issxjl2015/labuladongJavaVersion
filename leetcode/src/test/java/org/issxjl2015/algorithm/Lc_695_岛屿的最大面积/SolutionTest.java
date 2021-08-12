package org.issxjl2015.algorithm.Lc_695_岛屿的最大面积;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/12/23:23
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        int ans = solution.maxAreaOfIsland(grid);
        Assert.assertEquals(6, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] grid = {
                {0,0,0,0,0,0,0,0}
        };

        int ans = solution.maxAreaOfIsland(grid);
        Assert.assertEquals(0, ans);
    }
}
