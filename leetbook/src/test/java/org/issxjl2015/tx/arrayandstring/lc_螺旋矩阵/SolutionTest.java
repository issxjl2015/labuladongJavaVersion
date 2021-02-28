package org.issxjl2015.tx.arrayandstring.lc_螺旋矩阵;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        List<Integer> ans = solution.spiralOrder(matrix);
        int[] ansInt = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansInt[i] = ans.get(i);
        }

        List<Integer> expectList = new ArrayList<>();
        expectList.add(1);
        expectList.add(2);
        expectList.add(3);
        expectList.add(6);
        expectList.add(9);
        expectList.add(8);
        expectList.add(7);
        expectList.add(4);
        expectList.add(5);

        int[] expectInt = new int[expectList.size()];
        for (int i = 0; i < expectInt.length; i++) {
            expectInt[i] = expectList.get(i);
        }
        Assert.assertArrayEquals(expectInt, ansInt);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> ans = solution.spiralOrder(matrix);
        int[] ansInt = new int[ans.size()];
        for (int i = 0; i < ansInt.length; i++) {
            ansInt[i] = ans.get(i);
        }
        List<Integer> expectList = new ArrayList<>();
        expectList.add(1);
        expectList.add(2);
        expectList.add(3);
        expectList.add(4);
        expectList.add(8);
        expectList.add(12);
        expectList.add(11);
        expectList.add(10);
        expectList.add(9);
        expectList.add(5);
        expectList.add(6);
        expectList.add(7);
        int[] expectInt = new int[expectList.size()];
        for (int i = 0; i < expectInt.length; i++) {
            expectInt[i] = expectList.get(i);
        }
        Assert.assertArrayEquals(expectInt, ansInt);
    }
}
