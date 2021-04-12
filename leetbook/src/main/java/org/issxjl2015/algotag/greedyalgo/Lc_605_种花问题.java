package org.issxjl2015.algotag.greedyalgo;

/**
 * 能否种花的关键：前后是否有间隔。
 *
 * 边界值：第一个花盆，没有前置节点；最后一个花盆，没有后置节点；
 * 直接给 0
 *
 */
public class Lc_605_种花问题 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < flowerbed.length&& n > 0; i++) {
            if (flowerbed[i] == 1) {
                continue;
            }
            int pre = i == 0 ? 0 : flowerbed[i - 1];
            int next = i == (len - 1) ? 0 : flowerbed[i + 1];
            if (pre == 0 && next == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
