package org.issxjl2015.contest.biweeklycontest.biweeklycontest58;

import org.issxjl2015.contest.biweeklycontest.biweeklycontest48.Lc_5693_字符串中第二大的数字;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/11:04
 * @Description:
 */
public class Lc_5193_删除字符使字符串变好 {
    public String makeFancyString(String s) {
        int len = s.length();
        if (len < 3) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        for (int i = 2; i < len; i++) {
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Lc_5193_删除字符使字符串变好 solution = new Lc_5193_删除字符使字符串变好();
        String s = "leeetcode";
        String ans = solution.makeFancyString(s);
        System.out.println(ans);
        System.out.println("---------------------------------");
        String s1 = "aaabaaaa";
        String ans1 = solution.makeFancyString(s1);
        System.out.println(ans1);
        System.out.println("---------------------------------");
        String s2 = "aab";
        String ans2 = solution.makeFancyString(s2);
        System.out.println(ans2);
    }
}
