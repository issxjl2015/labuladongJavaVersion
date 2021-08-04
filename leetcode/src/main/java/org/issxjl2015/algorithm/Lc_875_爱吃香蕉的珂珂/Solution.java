package org.issxjl2015.algorithm.Lc_875_爱吃香蕉的珂珂;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/04/21:38
 * @Description:
 */
public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int min = piles[0], max = piles[n - 1];
        while (min < max) {
            int mid = min + (max - min) / 2;
            int time = process(piles, mid);
            if (time <= h) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    private int process(int[] piles, int speed) {
        int time = 0;
        for (int pile : piles) {
            if (pile > speed) {
                time += pile / speed + (pile % speed  == 0 ? 0 : 1);
            } else {
                time += 1;
            }
        }
        return time;
    }
}
