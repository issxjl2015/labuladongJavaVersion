package org.issxjl2015.contest.biweeklycontest.biweeklycontest48;

import org.junit.Assert;
import org.junit.Test;

public class Lc_5693_字符串中第二大的数字_test {

    @Test
    public void test1() {
        Lc_5693_字符串中第二大的数字 solution = new Lc_5693_字符串中第二大的数字();
        String s = "dfa12321afd";
        int ans = solution.secondHighest(s);
        System.out.println(ans);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Lc_5693_字符串中第二大的数字 solution = new Lc_5693_字符串中第二大的数字();
        String s1 = "abc1111";
        int ans1 = solution.secondHighest(s1);
        System.out.println(ans1);
        Assert.assertEquals(-1, ans1);
    }

    @Test
    public void test3() {
        Lc_5693_字符串中第二大的数字 solution = new Lc_5693_字符串中第二大的数字();
        String s1 = "sjhtz8344";
        int ans1 = solution.secondHighest(s1);
        System.out.println(ans1);
        Assert.assertEquals(4, ans1);
    }

    @Test
    public void test4() {
        Lc_5693_字符串中第二大的数字 solution = new Lc_5693_字符串中第二大的数字();
        String s1 = "ck077";
        int ans1 = solution.secondHighest(s1);
        System.out.println(ans1);
        Assert.assertEquals(0, ans1);
    }
}
