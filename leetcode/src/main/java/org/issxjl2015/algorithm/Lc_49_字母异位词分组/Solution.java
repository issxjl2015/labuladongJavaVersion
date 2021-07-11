package org.issxjl2015.algorithm.Lc_49_字母异位词分组;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String ss = String.valueOf(chars);
            if (set.contains(ss)) {
                List<String> list = map.get(ss);
                list.add(str);
                map.put(ss, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(ss, list);
                set.add(ss);
            }
        }

        set.forEach(chars -> ans.add(map.get(chars)));
        return ans;
    }
}
