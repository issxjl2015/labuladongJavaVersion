package org.issxjl2015.algorithm.Lc_1337_矩阵中战斗力最弱的K行;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/01/10:40
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int k = 3;
        int[] ans = solution.kWeakestRows(mat, k);
        Assert.assertEquals(2, ans[0]);
        Assert.assertEquals(0, ans[1]);
        Assert.assertEquals(3, ans[2]);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] mat = {
                {1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}
        };
        int k = 2;
        int[] ans = solution.kWeakestRows(mat, k);
        Assert.assertEquals(0, ans[0]);
        Assert.assertEquals(2, ans[1]);
    }
}
