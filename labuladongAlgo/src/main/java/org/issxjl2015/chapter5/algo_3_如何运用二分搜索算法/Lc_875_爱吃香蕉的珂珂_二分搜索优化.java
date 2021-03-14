package org.issxjl2015.chapter5.algo_3_如何运用二分搜索算法;

public class Lc_875_爱吃香蕉的珂珂_二分搜索优化 {

    public int minEatingSpeed(int[] piles, int h) {
        // piles 数组中的最大值
        int max = getMax(piles);
        int left = 1, right = max + 1;
        while (left < right) {
            // 防止溢出
            int mid = left + (right - left) / 2;
            if (canFinish(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean canFinish(int[] piles, int speed, int h) {
        int time = 0;
        for (int pile : piles) {
            time += costTime(pile, speed);
        }
        return time <= h;
    }

    public int costTime(int pile, int speed) {
        return pile / speed + ((pile % speed) > 0 ? 1 : 0);
    }

    public int getMax(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            max = Math.max(pile, max);
        }
        return max;
    }
}
