package org.issxjl2015.algorithm.Lc_475_供暖器;

import java.util.Arrays;

/**
 * 这道题过不了性能用例，28/30个通过测试用例
 */
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int lenHouses = houses.length;
        int lenHeaters = heaters.length;
        int left = 1, right = Math.max(
                Math.max(Math.abs(houses[0] - heaters[lenHeaters - 1]), Math.abs(houses[0] - heaters[0])),
                Math.max(Math.abs(houses[lenHouses - 1] - heaters[0]),
                        Math.abs(houses[lenHouses - 1] - heaters[lenHeaters - 1])));
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (coverHeater(houses, heaters, mid)) {
                right = mid - 1;
            } else {
                left =  mid + 1;
            }
        }
        return left;
    }

    /**
     * 判断是否覆盖
     * @param houses 房屋列表
     * @param heaters 供暖器列表
     * @param r 加热半径
     * @return 是否覆盖所有房屋
     */
    private boolean coverHeater(int[] houses, int[] heaters, int r) {
        boolean[] flagArr = new boolean[houses.length];
        for (int i = 0; i < houses.length; i++) {
            for (int j = 0; j < heaters.length; j++) {
                if (Math.abs(houses[i] - heaters[j]) <= r) {
                    flagArr[i] = true;
                    break;
                }
            }
            if (!flagArr[i]) {
                return false;
            }
        }
        return true;
    }
}
