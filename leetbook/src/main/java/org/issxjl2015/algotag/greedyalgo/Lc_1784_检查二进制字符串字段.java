package org.issxjl2015.algotag.greedyalgo;

import java.util.HashMap;
import java.util.Map;

public class Lc_1784_检查二进制字符串字段 {

    public boolean checkOnesSegment(String s) {
        if (s.length() <= 2) {
            return true;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (s.charAt(i) == '1') {
                    if (i != map.get(s.charAt(i)) + 1) {
                        return false;
                    } else {
                        map.put(s.charAt(i), i);
                    }
                }
            } else {
                map.put(s.charAt(i), i);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lc_1784_检查二进制字符串字段 solution = new Lc_1784_检查二进制字符串字段();
        String s = "1001";
        boolean ans = solution.checkOnesSegment(s);
        System.out.println(ans);
        System.out.println("=======================");

        String s1 = "110";
        boolean ans1 = solution.checkOnesSegment(s1);
        System.out.println(ans1);
    }
}
