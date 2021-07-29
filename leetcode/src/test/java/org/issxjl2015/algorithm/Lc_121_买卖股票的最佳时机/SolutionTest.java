package org.issxjl2015.algorithm.Lc_121_买卖股票的最佳时机;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/29/23:23
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int ans = solution.maxProfit(prices);
        Assert.assertEquals(5, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        int ans = solution.maxProfit(prices);
        Assert.assertEquals(0, ans);
    }
}
