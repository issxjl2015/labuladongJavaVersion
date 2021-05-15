package org.issxjl2015.contest.biweeklycontest.biweeklycontest52;

import org.junit.Assert;
import org.junit.Test;

public class Lc_5742_将句子排序_test {

    @Test
    public void test1() {
        Lc_5742_将句子排序 solution = new Lc_5742_将句子排序();
        String s = "is2 sentence4 This1 a3";
        String ans = solution.sortSentence(s);
        Assert.assertEquals("This is a sentence", ans);
    }

    @Test
    public void test2() {
        Lc_5742_将句子排序 solution = new Lc_5742_将句子排序();
        String s = "Myself2 Me1 I4 and3";
        String ans = solution.sortSentence(s);
        Assert.assertEquals("Me Myself and I", ans);
    }
}
