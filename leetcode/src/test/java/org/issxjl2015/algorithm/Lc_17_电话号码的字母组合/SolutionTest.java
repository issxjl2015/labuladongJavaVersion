package org.issxjl2015.algorithm.Lc_17_电话号码的字母组合;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String digits = "23";
        List<String> ans = solution.letterCombinations(digits);
        ans.forEach(System.out::println);
        Assert.assertEquals("ad", ans.get(0));
        Assert.assertEquals("ae", ans.get(1));
        Assert.assertEquals("af", ans.get(2));
        Assert.assertEquals("bd", ans.get(3));
        Assert.assertEquals("be", ans.get(4));
        Assert.assertEquals("bf", ans.get(5));
        Assert.assertEquals("cd", ans.get(6));
        Assert.assertEquals("ce", ans.get(7));
        Assert.assertEquals("cf", ans.get(8));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String digits = "";
        List<String> ans = solution.letterCombinations(digits);
        Assert.assertEquals(0, ans.size());
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String digits = "2";
        List<String> ans = solution.letterCombinations(digits);
        Assert.assertEquals(3, ans.size());
        Assert.assertEquals("a", ans.get(0));
        Assert.assertEquals("b", ans.get(1));
        Assert.assertEquals("c", ans.get(2));
    }
}
