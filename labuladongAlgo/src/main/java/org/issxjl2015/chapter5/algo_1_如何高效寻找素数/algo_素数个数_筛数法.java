package org.issxjl2015.chapter5.algo_1_如何高效寻找素数;

import java.util.Arrays;

public class algo_素数个数_筛数法 {

    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    isPrimes[j] = false;
                }
            }
        }
        int count = 0;
        for (int i =  2; i < n; i++) {
            if (isPrimes[i]) {
                count++;
            }
        }
        return count;
    }


}
