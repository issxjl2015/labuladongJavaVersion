package org.issxjl2015.contest.biweeklycontest.biweeklycontest48;

import java.util.Arrays;

public class Lc_5712_你能构造出连续值的最大数目 {

    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int len = coins.length;
        int expect = 1;
        for (int i = 0; i < len; i++) {
            // 如果coins[i] <= expect, 那么肯定能到达 expect + coins[i]，所以要更新 expect
            // 前面若干元素已经能够构造出 0,1,2,3，，，，ans - 1 个元素，则下一个元素必然要小于等于 ans 才能继续构造；
            if (coins[i] <= expect) {
                expect += coins[i];
            }
        }
        return expect;
    }

}
