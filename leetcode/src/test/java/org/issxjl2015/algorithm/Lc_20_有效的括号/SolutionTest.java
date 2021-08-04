package org.issxjl2015.algorithm.Lc_20_有效的括号;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/04/23:41
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        String s = "()";
        Solution solution = new Solution();
        boolean ans = solution.isValid(s);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        String s = "()[]{}";
        Solution solution = new Solution();
        boolean ans = solution.isValid(s);
        Assert.assertTrue(ans);
    }

    @Test
    public void test3() {
        String s = "(]";
        Solution solution = new Solution();
        boolean ans = solution.isValid(s);
        Assert.assertFalse(ans);
    }

    @Test
    public void test4() {
        String s = "([)]";
        Solution solution = new Solution();
        boolean ans = solution.isValid(s);
        Assert.assertFalse(ans);
    }

    @Test
    public void test5() {
        String s = "{[]}";
        Solution solution = new Solution();
        boolean ans = solution.isValid(s);
        Assert.assertTrue(ans);
    }
}

