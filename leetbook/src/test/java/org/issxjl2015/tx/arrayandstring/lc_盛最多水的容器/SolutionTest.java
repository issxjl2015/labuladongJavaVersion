package org.issxjl2015.tx.arrayandstring.lc_盛最多水的容器;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = solution.maxArea(height);
        Assert.assertEquals(ans, 49);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] height = {1,1};
        int ans = solution.maxArea(height);
        Assert.assertEquals(ans, 1);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] height = {4,3,2,1,4};
        int ans = solution.maxArea(height);
        Assert.assertEquals(ans, 16);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] height = {1,2,1};
        int ans = solution.maxArea(height);
        Assert.assertEquals(ans, 2);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] height = {0, 2};
        int ans = solution.maxArea(height);
        Assert.assertEquals(ans, 0);
    }

}
