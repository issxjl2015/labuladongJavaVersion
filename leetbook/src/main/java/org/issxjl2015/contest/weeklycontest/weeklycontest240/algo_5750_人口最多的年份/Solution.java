package org.issxjl2015.contest.weeklycontest.weeklycontest240.algo_5750_人口最多的年份;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int maximumPopulation(int[][] logs) {
        Arrays.sort(logs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int len = logs.length;
        int minYear = logs[0][0];
        int maxYear = logs[0][1];
        for (int i = 0; i < len; i++) {
            if (logs[i][0] < minYear) {
                minYear = logs[i][0];
            }
            if (logs[i][1] > maxYear) {
                maxYear = logs[i][1];
            }
        }
        int lens = maxYear - minYear + 1;
        int[] arr = new int[lens];
        for (int i = 0; i < len; i++) {
            arr[logs[i][0] - logs[0][0]]++;
            arr[logs[i][1] - logs[0][0]]--;
        }
        int[] ans = new int[lens];
        ans[0] = arr[0];
        int index = logs[0][0];
        int max = ans[0];
        for (int i = 1; i < lens; i++) {
            ans[i] = arr[i] + ans[i - 1];
            if (max < ans[i]) {
                index = i + logs[0][0];
                max = ans[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        int ans = solution.maximumPopulation(logs);
        System.out.println(ans);

        int[][] logs1 = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int ans1 = solution.maximumPopulation(logs1);
        System.out.println(ans1);
    }
}
