package org.issxjl2015.algorithm.Lc_188_买卖股票的最佳时机IV;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/20:30
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int k = 2;
        int[] prices = {2, 4, 1};
        int ans = solution.maxProfit(k, prices);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int k = 2;
        int[] prices = {3,2,6,5,0,3};
        int ans = solution.maxProfit(k, prices);
        Assert.assertEquals(7, ans);
    }
}
