package org.issxjl2015.chapter5.algo_1_如何高效寻找素数;

public class algo_素数个数_优化 {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrimes(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
