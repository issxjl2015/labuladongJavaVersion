package org.issxjl2015.algorithm.Lc_875_爱吃香蕉的珂珂;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/04/21:45
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        int ans = solution.minEatingSpeed(piles, H);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] piles = {30,11,23,4,20};
        int H = 5;
        int ans = solution.minEatingSpeed(piles, H);
        Assert.assertEquals(30, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] piles = {30,11,23,4,20};
        int H = 6;
        int ans = solution.minEatingSpeed(piles, H);
        Assert.assertEquals(23, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] piles = {30,11,23,4,20};
        int H = 6;
        int ans = solution.minEatingSpeed(piles, H);
        Assert.assertEquals(23, ans);
    }
}
