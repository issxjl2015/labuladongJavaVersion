package org.issxjl2015.contest.weeklycontest.weeklycontest253.algo_5838_检查字符串是否为数组前缀;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/12:06
 * @Description:
 */
public class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String[] wordsArr = new String[words.length];
        wordsArr[0] = words[0];
        if (s.equals(words[0])) {
            return true;
        }
        for (int i = 1; i < wordsArr.length; i++) {
            wordsArr[i] = wordsArr[i - 1] + words[i];
            if (s.equals(wordsArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s ="z";
        String[] words = {"z"};
        boolean falg = solution.isPrefixString(s, words);
        System.out.println(falg);
    }
}
