package org.issxjl2015.algorithm.Lc_77_组合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if (k <= 0 || n <= 0) {
            return ans;
        }
        LinkedList<Integer> track = new LinkedList<>();
        dfs(track, n, k, 1);
        return ans;
    }

    private void dfs(LinkedList<Integer> track, int n, int k, int index) {
        if (track.size() == k) {
            ans.add(new LinkedList<>(track));
            return;
        }

        for (int i = index; i <= n; i++) {
            track.add(i);
            dfs(track, n, k , i + 1);
            track.removeLast();
        }
    }
}
