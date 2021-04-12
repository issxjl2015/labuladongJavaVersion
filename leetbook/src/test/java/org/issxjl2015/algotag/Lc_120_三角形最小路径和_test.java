package org.issxjl2015.algotag;

import org.issxjl2015.algotag.dpalgo.Lc_120_三角形最小路径和;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Lc_120_三角形最小路径和_test {

    @Test
    public void test1() {
        Lc_120_三角形最小路径和 solution = new Lc_120_三角形最小路径和();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        int ans = solution.minimumTotal(list);
        Assert.assertEquals(11, ans);
    }

    @Test
    public void test2() {
        Lc_120_三角形最小路径和 solution = new Lc_120_三角形最小路径和();
        List<Integer> list1 = new ArrayList<>();
        list1.add(-10);

        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);

        int ans = solution.minimumTotal(list);
        Assert.assertEquals(-10, ans);
    }
}
