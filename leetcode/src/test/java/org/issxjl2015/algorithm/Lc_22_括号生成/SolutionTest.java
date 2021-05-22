package org.issxjl2015.algorithm.Lc_22_括号生成;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        List<String> ans = solution.generateParenthesis(3);
        Assert.assertEquals("((()))", ans.get(0));
        Assert.assertEquals("(()())", ans.get(1));
        Assert.assertEquals("(())()", ans.get(2));
        Assert.assertEquals("()(())", ans.get(3));
        Assert.assertEquals("()()()", ans.get(4));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        List<String> ans = solution.generateParenthesis(1);
        Assert.assertEquals("()", ans.get(0));
    }
}
