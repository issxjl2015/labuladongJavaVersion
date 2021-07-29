package org.issxjl2015.algorithm.Lc_123_买卖股票的最佳时机III;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/29/23:55
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] prices = {3,3,5,0,0,3,1,4};
        int ans = solution.maxProfit(prices);
        Assert.assertEquals(6, ans);
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
