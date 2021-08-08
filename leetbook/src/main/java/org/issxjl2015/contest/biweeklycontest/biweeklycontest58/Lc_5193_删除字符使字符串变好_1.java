package org.issxjl2015.contest.biweeklycontest.biweeklycontest58;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/11:04
 * @Description:
 */
public class Lc_5193_删除字符使字符串变好_1 {
    public String makeFancyString(String s) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            int j =  i + 1;
            // 找到所有相同的字符
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            // 遍历这些字符，取出2个
            for (int k = 0; k < 2 && k < j - i; k++) {
                sb.append(s.charAt(i));
            }
            // 更新下标 i
            i = j - 1;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Lc_5193_删除字符使字符串变好_1 solution = new Lc_5193_删除字符使字符串变好_1();
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
