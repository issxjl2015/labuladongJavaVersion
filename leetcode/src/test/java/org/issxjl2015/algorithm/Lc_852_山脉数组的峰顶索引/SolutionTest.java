package org.issxjl2015.algorithm.Lc_852_山脉数组的峰顶索引;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/02/22:26
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] arr = {0, 1, 0};
        int ans = solution.peakIndexInMountainArray(arr);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] arr = {0, 2, 1, 0};
        int ans = solution.peakIndexInMountainArray(arr);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] arr = {0, 10, 5, 2};
        int ans = solution.peakIndexInMountainArray(arr);
        Assert.assertEquals(1, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] arr = {3, 4, 5, 2};
        int ans = solution.peakIndexInMountainArray(arr);
        Assert.assertEquals(2, ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int ans = solution.peakIndexInMountainArray(arr);
        Assert.assertEquals(2, ans);
    }
}
