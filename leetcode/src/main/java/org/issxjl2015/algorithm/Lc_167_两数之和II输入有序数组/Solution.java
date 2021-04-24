package org.issxjl2015.algorithm.Lc_167_两数之和II输入有序数组;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 双指针
        int[] ans = new int[] {};
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[] {left, right};
            }
        }
        return new int[] {};
    }
}
