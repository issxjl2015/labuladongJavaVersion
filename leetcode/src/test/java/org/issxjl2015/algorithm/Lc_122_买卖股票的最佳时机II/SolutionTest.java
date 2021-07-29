package org.issxjl2015.algorithm.Lc_122_买卖股票的最佳时机II;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/29/23:37
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int ans = solution.maxProfit(prices);
        Assert.assertEquals(7, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] prices = {1,2,3,4,5};
        int ans = solution.maxProfit(prices);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        int ans = solution.maxProfit(prices);
        Assert.assertEquals(0, ans);
    }
}
