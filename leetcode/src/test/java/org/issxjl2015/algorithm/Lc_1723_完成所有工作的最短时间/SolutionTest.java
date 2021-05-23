package org.issxjl2015.algorithm.Lc_1723_完成所有工作的最短时间;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] jobs = {3, 2, 3};
        int k = 3;
        int ans = solution.minimumTimeRequired(jobs, k);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] jobs = {1,2,4,7,8};
        int k = 2;
        int ans = solution.minimumTimeRequired(jobs, k);
        Assert.assertEquals(11, ans);
    }
}
