package org.issxjl2015.algorithm.Lc_131_分割回文串;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "aab";
        List<List<String>> ans = solution.partition(s);
        List<String> list1 = ans.get(0);
        Assert.assertEquals("a", list1.get(0));
        Assert.assertEquals("a", list1.get(1));
        Assert.assertEquals("b", list1.get(2));
        List<String> list2 = ans.get(1);
        Assert.assertEquals("aa", list2.get(0));
        Assert.assertEquals("b", list2.get(1));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "a";
        List<List<String>> ans = solution.partition(s);
        List<String> list1 = ans.get(0);
        Assert.assertEquals("a", list1.get(0));
    }
}
