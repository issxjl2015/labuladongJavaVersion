package org.issxjl2015.algorithm.Lc_474_一和零;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        int ans = solution.findMaxForm(strs, m, n);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String[] strs = {"10", "1", "0"};
        int m = 1;
        int n = 1;
        int ans = solution.findMaxForm(strs, m, n);
        Assert.assertEquals(2, ans);
    }
}
