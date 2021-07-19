package org.issxjl2015.algorithm.Lc_17_电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<String> ans = new ArrayList<>();
    Map<Character, String> map;

    {
        this.map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return ans;
        }
        StringBuffer sb = new StringBuffer();
        dfs(sb, digits, 0);
        return ans;
    }

    private void dfs(StringBuffer sb, String digits, int index) {
        if (index == digits.length()) {
            ans.add(new String(sb));
            return;
        }

        String str = map.get(digits.charAt(index));
        // digits 的 第 index 位字符，对应的map 的字符串。
        // 遍历是从 0 开始的
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            // 进入到 index + 1 层级，即 digits 下一个字符所对应的的字符串
            dfs(sb, digits, index + 1);
            // 注意：此处为 删除index层级的所有选择
            sb.deleteCharAt(index);
        }
    }

}
