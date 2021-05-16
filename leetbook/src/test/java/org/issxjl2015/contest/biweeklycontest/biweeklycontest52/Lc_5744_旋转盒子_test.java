package org.issxjl2015.contest.biweeklycontest.biweeklycontest52;

import org.junit.Assert;
import org.junit.Test;

public class Lc_5744_旋转盒子_test {

    @Test
    public void test1() {
        char[][] box = {{'#', '.', '#'}};
        Lc_5744_旋转盒子 solution = new Lc_5744_旋转盒子();
        char[][] ans = solution.rotateTheBox(box);
        Assert.assertEquals('.', ans[0][0]);
        Assert.assertEquals('#', ans[1][0]);
        Assert.assertEquals('#', ans[2][0]);
    }

    @Test
    public void test2() {
        char[][] box = {{'#', '.', '*', '.'}, {'#', '#', '*', '.'}};
        Lc_5744_旋转盒子 solution = new Lc_5744_旋转盒子();
        char[][] ans = solution.rotateTheBox(box);
        Assert.assertEquals('#', ans[0][0]);
        Assert.assertEquals('.', ans[0][1]);
        Assert.assertEquals('#', ans[1][0]);
        Assert.assertEquals('#', ans[1][1]);
        Assert.assertEquals('*', ans[2][0]);
        Assert.assertEquals('*', ans[2][1]);
        Assert.assertEquals('.', ans[3][0]);
        Assert.assertEquals('.', ans[3][1]);
    }

    @Test
    public void test3() {
        char[][] box = {{'#', '#', '*', '.', '*', '.'}, {'#', '#', '#', '*', '.', '.'}, {'#', '#', '#', '.', '#', '.'}};
        Lc_5744_旋转盒子 solution = new Lc_5744_旋转盒子();
        char[][] ans = solution.rotateTheBox(box);
        Assert.assertEquals('.', ans[0][0]);
        Assert.assertEquals('#', ans[0][1]);
        Assert.assertEquals('#', ans[0][2]);
        Assert.assertEquals('.', ans[1][0]);
        Assert.assertEquals('#', ans[1][1]);
        Assert.assertEquals('#', ans[1][2]);
        Assert.assertEquals('#', ans[2][0]);
        Assert.assertEquals('#', ans[2][1]);
        Assert.assertEquals('*', ans[2][2]);
        Assert.assertEquals('#', ans[3][0]);
        Assert.assertEquals('*', ans[3][1]);
        Assert.assertEquals('.', ans[3][2]);
        Assert.assertEquals('#', ans[4][0]);
        Assert.assertEquals('.', ans[4][1]);
        Assert.assertEquals('*', ans[4][2]);
        Assert.assertEquals('#', ans[5][0]);
        Assert.assertEquals('.', ans[5][1]);
        Assert.assertEquals('.', ans[5][2]);
    }
}
