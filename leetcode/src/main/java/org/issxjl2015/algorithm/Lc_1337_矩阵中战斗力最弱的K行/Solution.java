package org.issxjl2015.algorithm.Lc_1337_矩阵中战斗力最弱的K行;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/01/10:16
 * @Description:
 */
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            if (map.containsKey(sum)) {
                List<Integer> list = map.get(sum);
                list.add(i);
                map.put(sum, list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(sum, list);
            }
        }
        int[] ans = new int[k];
        List<Integer> listAll = new ArrayList<>();
        for (Integer index : map.keySet()) {
            List<Integer> list = map.get(index);
            listAll.addAll(list);
        }
        for (int i = 0; i < listAll.size() && i < k; i++) {
            ans[i] = listAll.get(i);
        }
        return ans;
    }
}
