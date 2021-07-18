package org.issxjl2015.algorithm.Lc_216_组合总和III;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k <= 0 || n <= 0 || n > 45) {
            return ans;
        }

        LinkedList<Integer> track = new LinkedList<>();
        dfs(track, n, k, 1, 0);
        return ans;
    }

    private void dfs(LinkedList<Integer> track, int n, int k, int index, int sum) {
        if (sum > n || track.size() > k) {
            return;
        }

        if (track.size() == k && sum == n) {
            ans.add(new LinkedList<>(track));
            return;
        }

        for (int i = index; i <= 9 && track.size() < k && sum < n && i <= n - (k - track.size()) + 1; i++) {
            track.add(i);
            sum += i;
            dfs(track, n, k, i + 1, sum);
            sum -= i;
            track.removeLast();
        }
    }

}
