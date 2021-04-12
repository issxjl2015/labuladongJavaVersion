package org.issxjl2015.chapter5.algo_3_如何运用二分搜索算法;

public class Lc_1011_在D天内送达包裹的能力 {

    public int shipWithinDays(int[] weights, int D) {
        int min = getWeights(weights)[0];
        int max = getWeights(weights)[1];
        for (int i = min; i < max; i++) {
            if (canFinsh(weights, i, D)) {
                return i;
            }
        }
        return max;
    }

    public boolean canFinsh(int[] weights, int speed, int t) {
        int time = 0;
        for (int weight : weights) {
            time += costTime(weight, speed);
        }
        return time <= t;
    }

    public int costTime(int weight, int speed) {
        return weight / speed + ((weight % speed > 0) ? 1 : 0);
    }

    public int[] getWeights(int[] weights) {
        int min = weights[0];
        int max = 0;
        for (int weight : weights) {
            min = Math.min(min, weight);
            max += weight;
        }
        int[] res = new int[2];
        res[0] = min;
        res[1] = max;
        return res;
    }
}
