package org.issxjl2015.contest.weeklycontest.weeklycontest241.algo_5760_构成交替字符串需要的最小交换次数;

public class Solution {

    public int minSwaps(String s) {
        char[] arr = s.toCharArray();
        int num1 = 0, num0 = 0;
        for (char c : arr) {
            if (c == '0') {
                num0++;
            } else {
                num1++;
            }
        }
        // | 1 的数量 - 0 的数量 | > 1，无论如何交换，总会连在一起，不符合条件
        if (Math.abs(num0 - num1) > 1) {
            return -1;
        }

        // 1 和 0 的数量不相同的时候，构成的交替字符串，下标为 0 的字符必定是多个那个
        if (num0 > num1) {
            // 0 开头，那么判断所有奇数位上 1 的个数
            return getSum(arr, '1');
        } else if (num0 < num1) {
            // 1 开头，那么判断所有奇数位上 0 的个数
            return getSum(arr, '0');
        } else {
            // 数量相同时，从下标为 0 的字符是 1 和 下标为 0 的字符为 0 两种情况中取最小的
            return Math.min(getSum(arr, '0'), getSum(arr, '1'));
        }

    }

    /**
     * even: 偶数位需要替换的字符
     * @param arr 数组
     * @param even 偶数位需要替换的字符
     * @return 返回替换的次数
     */
    private int getSum(char[] arr, char even) {
        int res = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] == even) {
                res++;
            }
        }
        return res;
    }
}
