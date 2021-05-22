package org.issxjl2015.algorithm.Lc_93_复原IP地址;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "25525511135";
        List<String> ans = solution.restoreIpAddresses(s);
        Assert.assertEquals("255.255.11.135", ans.get(0));
        Assert.assertEquals("255.255.111.35", ans.get(1));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "0000";
        List<String> ans = solution.restoreIpAddresses(s);
        Assert.assertEquals("0.0.0.0", ans.get(0));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "1111";
        List<String> ans = solution.restoreIpAddresses(s);
        Assert.assertEquals("1.1.1.1", ans.get(0));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String s = "010010";
        List<String> ans = solution.restoreIpAddresses(s);
        Assert.assertEquals("0.10.0.10", ans.get(0));
        Assert.assertEquals("0.100.1.0", ans.get(1));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        String s = "101023";
        List<String> ans = solution.restoreIpAddresses(s);
        Assert.assertEquals("1.0.10.23", ans.get(0));
        Assert.assertEquals("1.0.102.3", ans.get(1));
        Assert.assertEquals("10.1.0.23", ans.get(2));
        Assert.assertEquals("10.10.2.3", ans.get(3));
        Assert.assertEquals("101.0.2.3", ans.get(4));
    }
}
