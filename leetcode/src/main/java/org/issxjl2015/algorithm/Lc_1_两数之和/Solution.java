package org.issxjl2015.algorithm.Lc_1_两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // key : 具体的数值， value : 该数值的下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            // 计算出另一个数值
            int tmp = target - nums[i];
            // 判断 map 是否有这个值，且 这个值的下标和当前遍历的数值的下标是否不同
            if (map.containsKey(tmp) && (i != map.get(tmp))) {
                return new int[] {i, map.get(tmp)};
            }
        }

        return new int[] {};
    }
}
