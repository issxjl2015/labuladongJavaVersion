package org.issxjl2015.contest.biweeklycontest.biweeklycontest52;

import java.util.Map;
import java.util.TreeMap;

/**
 * easy：对字符串进行处理成下标索引以及字符串，并用TreeMap的数据结构来保存
 */
public class Lc_5742_将句子排序 {

    public String sortSentence(String s) {
        Map<Integer, String> map = new TreeMap<>();
        String[] sArr = s.trim().split(" ");
        for (String str : sArr) {
            Integer index = (int) str.charAt(str.length() - 1);
            String ss = str.substring(0, str.length() - 1);
            map.put(index, ss);
        }
        StringBuffer sb = new StringBuffer();
        for (Integer key : map.keySet()) {
            sb.append(map.get(key)).append(" ");
        }
        return sb.toString().trim();
    }
}
