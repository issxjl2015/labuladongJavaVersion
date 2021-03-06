package org.issxjl2015.chapter2;

import org.issxjl2015.chapter2.algo_7_子序列问题解题模板_最长回文子序列.Lc_516_最长回文子序列_1;
import org.issxjl2015.chapter2.algo_8_状态压缩_对动态规划进行降维打击.Lc_516_最长回文子序列_2;
import org.junit.Assert;
import org.junit.Test;

public class Lc_516_最长回文子序列_2_test {

    @Test
    public void test1() {
        Lc_516_最长回文子序列_2 solution  = new Lc_516_最长回文子序列_2();
        String s = "bbbab";
        int ans = solution.longestPalindromeSubseq(s);
        Assert.assertEquals(4, ans);
    }


    @Test
    public void test2() {
        Lc_516_最长回文子序列_2 solution  = new Lc_516_最长回文子序列_2();
        String s = "cbbd";
        int ans = solution.longestPalindromeSubseq(s);
        Assert.assertEquals(2, ans);
    }
}
