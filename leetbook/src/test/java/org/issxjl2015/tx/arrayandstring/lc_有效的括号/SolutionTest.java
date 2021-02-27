package org.issxjl2015.tx.arrayandstring.lc_有效的括号;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "()";
        boolean flag = solution.isValid(s);
        Assert.assertTrue(flag);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "()[]{}";
        boolean flag = solution.isValid(s);
        Assert.assertTrue(flag);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "(]";
        boolean flag = solution.isValid(s);
        Assert.assertFalse(flag);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String s = "([)]";
        boolean flag = solution.isValid(s);
        Assert.assertFalse(flag);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        String s = "{[]}";
        boolean flag = solution.isValid(s);
        Assert.assertTrue(flag);
    }

}
