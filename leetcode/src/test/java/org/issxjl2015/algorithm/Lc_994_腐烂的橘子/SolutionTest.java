package org.issxjl2015.algorithm.Lc_994_腐烂的橘子;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/12/23:05
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        int ans = solution.orangesRotting(grid);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] grid = {
                {2,1,1},
                {0,1,1},
                {1,0,1}
        };

        int ans = solution.orangesRotting(grid);
        Assert.assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[][] grid = {
                {0, 2}
        };

        int ans = solution.orangesRotting(grid);
        Assert.assertEquals(0, ans);
    }
}
