package org.issxjl2015.algorithm.Lc_784_字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/10/22:35
 * @Description:
 */
public class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        dfs(s.trim().toCharArray(), "");
        return ans;
    }

    private void dfs(char[] arr, String ss) {
        for (int i = ss.length(); i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                char another = (char)(arr[i] - 'a' >= 0 ? arr[i] -  32 : arr[i] + 32);
                dfs(arr, ss + another);
            }
            ss += arr[i];
        }
        ans.add(ss);
    }
}
