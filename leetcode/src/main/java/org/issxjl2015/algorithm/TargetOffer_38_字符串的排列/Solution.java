package org.issxjl2015.algorithm.TargetOffer_38_字符串的排列;

import java.util.*;

public class Solution {
    List<List<String>> ans = new ArrayList<>();
    Boolean[] visits;
    public String[] permutation(String s) {
        visits = new Boolean[s.length()];
        Arrays.fill(visits, false);
        if (s.length() == 1) {
            return new String[]{s};
        }
        LinkedList<String> track = new LinkedList<>();
        dfs(s, track, 0);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < ans.size(); i++) {
            String tmp = String.join("", ans.get(i));
            if (set.contains(tmp)) {
                continue;
            }
            set.add(tmp);
        }
        String[] result = new String[set.size()];
        int index = 0;
        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String str = it.next();
            result[index++] = str;
        }
        return result;
    }

    private void dfs(String s, LinkedList<String> track, int index) {
        if (index == s.length()) {
            ans.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (visits[i]) {
                continue;
            }
            visits[i] = true;
            track.add(s.substring(i, i + 1));
            dfs(s, track, index + 1);
            visits[i] = false;
            track.removeLast();
        }
    }
}
