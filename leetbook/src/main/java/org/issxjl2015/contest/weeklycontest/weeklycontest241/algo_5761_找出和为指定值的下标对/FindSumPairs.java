package org.issxjl2015.contest.weeklycontest.weeklycontest241.algo_5761_找出和为指定值的下标对;

import java.util.*;

public class FindSumPairs {
    int[] n1 = null;
    int[] n2 = null;
    Map<Integer, Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        for (int i : n2) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
    }

    public void add(int index, int val) {
        map.put(n2[index], map.get(n2[index]) - 1);
        n2[index] += val;
        map.put(n2[index], map.getOrDefault(n2[index], 0) + 1);
    }

    public int count(int tot) {
        int cnt = 0;
        for (int i : n1) {
            if (map.containsKey(tot - i)) {
                cnt += map.get(tot - i);
            }
        }
        return cnt;
    }
}
