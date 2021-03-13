package org.issxjl2015.chapter4;

import org.issxjl2015.chapter4.algo_3_回溯算法最佳实践_括号生成.Lc_22_括号生成;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Lc_22_括号生成_test {

    @Test
    public void test1() {
        Lc_22_括号生成 solution = new Lc_22_括号生成();
        int n = 3;
        List<String> ans = solution.generateParenthesis(n);
        System.out.println(ans);
        Assert.assertEquals(5, ans.size());
    }

    @Test
    public void test2() {
        Lc_22_括号生成 solution = new Lc_22_括号生成();
        int n = 1;
        List<String> ans = solution.generateParenthesis(n);
        System.out.println(ans);
        Assert.assertEquals(1, ans.size());
    }
}
