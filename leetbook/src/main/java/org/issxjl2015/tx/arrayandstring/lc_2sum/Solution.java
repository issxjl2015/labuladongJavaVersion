package org.issxjl2015.tx.arrayandstring.lc_2sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1、遍历数组，构建map, key为 value， value为 index
 * 2、再次遍历数组，计算出当前值与tmp值的和为target是否存在于map中
 * 3、出现符合条件的两个数，要再次判断是否为相同的数, 相同的数不符合条件
 * 4、输出
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 构建map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp) && map.get(tmp) != i) {
                return new int[] {i, map.get(tmp)};
            }
        }
        return new int[]{};
    }
}
