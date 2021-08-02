package org.issxjl2015.algorithm.Lc_852_山脉数组的峰顶索引;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/02/22:24
 * @Description:
 */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}
