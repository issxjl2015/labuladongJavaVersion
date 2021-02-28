package org.issxjl2015.tx.math.lc_回文数;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int x = 121;
        boolean ans = solution.isPalindrome(x);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int x = -121;
        boolean ans = solution.isPalindrome(x);
        Assert.assertFalse(ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int x = 10;
        boolean ans = solution.isPalindrome(x);
        Assert.assertFalse(ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int x = -101;
        boolean ans = solution.isPalindrome(x);
        Assert.assertFalse(ans);
    }
}
