package org.issxjl2015.algorithm.Lc_714_买卖股票的最佳时机含手续费;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/21:44
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int ans = solution.maxProfit(prices, fee);
        Assert.assertEquals(8, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int ans = solution.maxProfit(prices, fee);
        Assert.assertEquals(8, ans);
    }
}
