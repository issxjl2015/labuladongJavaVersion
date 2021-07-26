package org.issxjl2015.algorithm.Lc_367_有效的完全平方数;

public class Solution {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long left = 1, right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

}
