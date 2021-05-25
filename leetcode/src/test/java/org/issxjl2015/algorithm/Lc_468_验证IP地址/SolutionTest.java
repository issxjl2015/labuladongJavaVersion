package org.issxjl2015.algorithm.Lc_468_验证IP地址;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String IP = "172.16.254.1";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("IPv4", ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("IPv6", ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String IP = "256.256.256.256";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("Neither", ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("Neither", ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        String IP = "1e1.4.5.6";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("Neither", ans);
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        String IP = "1.1.1.1.";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("Neither", ans);
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        String IP = "12..33.4";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("Neither", ans);
    }

    @Test
    public void test8() {
        Solution solution = new Solution();
        String IP = "20EE:FGb8:85a3:0:0:8A2E:0370:7334";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("Neither", ans);
    }

    @Test
    public void test9() {
        Solution solution = new Solution();
        String IP = "192.0.0.1";
        String ans = solution.validIPAddress(IP);
        Assert.assertEquals("IPv4", ans);
    }
}
