package org.issxjl2015.contest.weeklycontest.weeklycontest232;

import org.issxjl2015.contest.weeklycontest.weeklycontest232.algo_5702_找出星型图的中心节点.Solution;
import org.junit.Assert;
import org.junit.Test;

public class algo_5702_找出星型图的中心节点_test {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] edges = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        int ans = solution.findCenter(edges);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        int ans = solution.findCenter(edges);
        Assert.assertEquals(2, ans);
    }
}
