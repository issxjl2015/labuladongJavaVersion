package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp;

import java.util.Arrays;
import java.util.Comparator;

public class ArrBaseOp {

    /**
     * 遍历数组
     * @param arr arr
     */
    public void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 迭代访问arr[i]
            System.out.println(arr[i]);
        }
    }

    /**
     * 排序二维数组
     * 按照一维 降序，二维 升序
     * 例如：排序前：arr = {{5, 4}, {6, 4}, {6, 7}, {2, 3}}
     * 排序后：arr = {{2, 3}, {5, 4}, {6, 7}, {6, 4}}
     * @param arr
     */
    public void sortTwoDimensionalArray(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
            }
        });
    }
}
